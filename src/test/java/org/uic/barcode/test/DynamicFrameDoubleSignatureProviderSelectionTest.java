package org.uic.barcode.test;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.zip.DataFormatException;

import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.junit.Before;
import org.junit.Test;
import org.uic.barcode.Decoder;
import org.uic.barcode.Encoder;
import org.uic.barcode.dynamicFrame.Constants;
import org.uic.barcode.dynamicFrame.DataType;
import org.uic.barcode.test.utils.Level2TestDataFactory;
import org.uic.barcode.test.utils.SimpleUICTestTicket;
import org.uic.barcode.ticket.EncodingFormatException;
import org.uic.barcode.ticket.api.spec.IUicRailTicket;

public class DynamicFrameDoubleSignatureProviderSelectionTest {
	
	public String signatureAlgorithmOID = null;
	public String elipticCurve = null;
	public String keyPairAlgorithmOID = null;
	
	public KeyPair keyPairLevel1 = null;
	public KeyPair keyPairLevel2 = null;
	
	public IUicRailTicket testFCBticket = null;
	
	public Provider prov = null;
	
	@Before public void initialize() {
		
		signatureAlgorithmOID = Constants.ECDSA_SHA256;
		keyPairAlgorithmOID = Constants.KG_EC_256;
		elipticCurve = "secp256k1";
		
	    testFCBticket = SimpleUICTestTicket.getUicTestTicket();
			
	    prov =  new BouncyCastleProvider();
		
		Security.addProvider(prov);

		try {
			keyPairLevel1  = generateECKeys(keyPairAlgorithmOID, elipticCurve);
			keyPairLevel2  = generateECKeys(keyPairAlgorithmOID, elipticCurve);
		} catch (Exception e) {
			assert(false);
		}

        assert(keyPairLevel1 != null);
        
        assert(keyPairLevel2 != null);
        
	}
	
	

	@Test public void testDynamicHeaderBarcodeDecoding() {
		
		IUicRailTicket ticket = testFCBticket;

		Encoder enc = null;

		try {
			enc = new Encoder(ticket, null, Encoder.UIC_BARCODE_TYPE_DOSIPAS, 1, 13);
		} catch (IOException | EncodingFormatException e1) {
			assert(false);
		}
		
		assert(enc != null);
		
		try {
			enc.setLevel1Algs(signatureAlgorithmOID, keyPairAlgorithmOID);
			enc.setLevel2Algs(signatureAlgorithmOID, keyPairAlgorithmOID,keyPairLevel2.getPublic());
			enc.signLevel1("1080", keyPairLevel1.getPrivate(), signatureAlgorithmOID, "1",prov);
		} catch (Exception e) {
			assert(false);
		}
		
		assert(enc != null);
		
		
		DataType level2Data = Level2TestDataFactory.getLevel2SimpleTestData();
		try {
			enc.setLevel2Data(level2Data);
			enc.signLevel2(keyPairLevel2.getPrivate(),prov);
		} catch (Exception e) {
			assert(false);
		}
		
			
        byte[] encoded = null;
		try {
			encoded = enc.encode();
		} catch (Exception e) {
			assert(false);
		}
        
        assert(encoded != null);
		
        Decoder dec = null;
		try {
			dec = new Decoder(encoded);
		} catch (IOException e) {
			assert(false);
		} catch (EncodingFormatException e) {
			assert(false);
		} catch (DataFormatException e) {
			assert(false);
		}
		assert(dec != null);
        
        int signatureCheck = 0;
		try {
			signatureCheck = dec.validateLevel1(keyPairLevel1.getPublic(), null, prov);
		} catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | IllegalArgumentException
				| UnsupportedOperationException | IOException | EncodingFormatException e) {
			assert(false);
		}
        assert(signatureCheck == Constants.LEVEL1_VALIDATION_OK);

        signatureCheck = 0;
		try {
			signatureCheck = dec.validateLevel2(prov);
		} catch (IllegalArgumentException | UnsupportedOperationException e) {
			assert(false);
		}
        assert(signatureCheck == Constants.LEVEL2_VALIDATION_OK);              
        
        DataType level2DataDec = dec.getLevel2Data();
        
        assert(level2Data.getFormat().equals(level2DataDec.getFormat()));
        assert(Arrays.equals(level2Data.getData().toByteArray(),level2DataDec.getData().toByteArray()));        
        
        SimpleUICTestTicket.compare(ticket, dec.getUicTicket());     
        
	}	
	
	public KeyPair generateECDSAKeys(String keyAlgorithmName, String paramName)  throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException{
		ECParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec(paramName);
	    KeyPairGenerator g = KeyPairGenerator.getInstance(keyAlgorithmName, "BC");
	    g.initialize(ecSpec, new SecureRandom());
	    return g.generateKeyPair();	    
    }
		
	public KeyPair generateECKeys(String keyAlgorithmOid, String curve)  throws Exception{
		
		String keyAlgorithmName = "ECDSA";
		ECParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec(curve);
	    KeyPairGenerator g = KeyPairGenerator.getInstance(keyAlgorithmName, "BC");
	    g.initialize(ecSpec, new SecureRandom());
	    return g.generateKeyPair();	    
    }


}

package org.uic.barcode.ticket.api.test.testtickets;

import org.uic.barcode.asn1.datatypes.Asn1BigInteger;
import org.uic.barcode.ticket.api.asn.omv3.CardReferenceType;
import org.uic.barcode.ticket.api.asn.omv3.ControlData;
import org.uic.barcode.ticket.api.asn.omv3.CustomerStatusType;
import org.uic.barcode.ticket.api.asn.omv3.DelayConfirmation;
import org.uic.barcode.ticket.api.asn.omv3.DocumentData;
import org.uic.barcode.ticket.api.asn.omv3.ExtensionData;
import org.uic.barcode.ticket.api.asn.omv3.IssuingData;
import org.uic.barcode.ticket.api.asn.omv3.SequenceOfCardReferenceType;
import org.uic.barcode.ticket.api.asn.omv3.SequenceOfCustomerStatusType;
import org.uic.barcode.ticket.api.asn.omv3.SequenceOfDocumentData;
import org.uic.barcode.ticket.api.asn.omv3.SequenceOfExtensionData;
import org.uic.barcode.ticket.api.asn.omv3.SequenceOfTicketLinkType;
import org.uic.barcode.ticket.api.asn.omv3.SequenceOfTravelerType;
import org.uic.barcode.ticket.api.asn.omv3.TicketDetailData;
import org.uic.barcode.ticket.api.asn.omv3.TicketLinkType;
import org.uic.barcode.ticket.api.asn.omv3.TravelerData;
import org.uic.barcode.ticket.api.asn.omv3.TravelerType;
import org.uic.barcode.ticket.api.asn.omv3.UicRailTicketData;

	public class DelayTestTicketV3 {
		
		
		/*
		 * 
		 * 
value UicRailTicketData ::= {
  issuingDetail {
    issuingYear 2021,
    issuingDay 63,
    issuingTime 750,
    specimen TRUE,
    securePaperTicket FALSE,
    activated TRUE,
    currency "EUR",
    currencyFract 2,
    issuerPNR "issuerTestPNR",
    issuedOnLine 12
  },
  travelerDetail {
    traveler {
      {
        firstName "John",
        secondName "Dow",
        idCard "12345",
        ticketHolder TRUE,
        status {
          {
            customerStatusDescr "employee"
          }
        }
      }
    }
  },
  transportDocument {
    {
      ticket delayConfirmation : {
        referenceIA5 "ABDJ12345",
        trainNum 100,
        departureYear 2022,
        departureDay 12,
        departureTime 1000,
        stationCodeTable stationUIC,
        stationNum 8000001,
        delay 31,
        trainCancelled FALSE,
        confirmationType travelerDelayConfirmation,
        affectedTickets {
          {
            referenceNum 801234567890,
            productOwnerNum 1080,
            ticketType openTicket,
            linkMode issuedTogether
          }
        },
        infoText "delay confirmation"
      }
    }
  },
  controlDetail {
    identificationByCardReference {
      {
        trailingCardIdNum 100
      }
    },
    identificationByIdCard FALSE,
    identificationByPassportId FALSE,
    passportValidationRequired FALSE,
    onlineValidationRequired FALSE,
    ageCheckRequired FALSE,
    reductionCardCheckRequired FALSE,
    infoText "cd"
  },
  extension {
    {
      extensionId "1",
      extensionData '82DA'H
    },
    {
      extensionId "2",
      extensionData '83DA'H
    }
  }
}

		 */
		
		public static UicRailTicketData getUicTestTicket() {
			UicRailTicketData ticket = new UicRailTicketData();
	    	populateTicket(ticket);
			return ticket;
		}
		
		public static String getEncodingHex() {
			return "780440A3E5DD4374F3E7D72F2A9979F4A13A90086200B4001044A6F686E03446F77"
					+ "0562C99B46B01108CBB786CDFE72E50116AE4C130614494C593368D405901816"
					+ "FA1E848001E009201802EA35350B4821B893232B630BC9031B7B73334B936B0B"
					+ "A34B7B7240100402C800131B20100B10282DA01640507B4";
			
		}
		
		
		
	    private static void populateTicket(UicRailTicketData ticket) {
	    	
	    	ticket.setControlDetail(new ControlData());
	    	populate(ticket.getControlDetail());
	    	
	     	
	    	ticket.setIssuingDetail(new IssuingData());
	    	populateIssuingData(ticket.getIssuingDetail());
	    	
	    	TravelerData td = new TravelerData();
	    	populateTravelerData(td);
	    	ticket.setTravelerDetail(td);    	
	    	
	    	SequenceOfDocumentData ds = new SequenceOfDocumentData();

	    	
	    	//FipTicket
	    	DocumentData do1 = new DocumentData();
	    	addTicket(do1);    	
	    	ds.add(do1);   	    	
	    	 	    	
	    	
	    	ticket.setTransportDocument(ds);
	    	
	       	SequenceOfExtensionData ed = new SequenceOfExtensionData();
	    	populateExtensionSequence(ed);
	    	ticket.setExtension(ed);
	    	
		}
	    

	    //issue date: 04-03-2021 12:30 UTC
	    private static void populateIssuingData(IssuingData issuingDetail) {
	    	issuingDetail.setIssuingYear(2021L);
	    	issuingDetail.setIssuingTime(750L);
	    	issuingDetail.setIssuingDay(63L);
	    	issuingDetail.setIssuerPNR("issuerTestPNR");
	    	issuingDetail.setSpecimen(true);
	    	issuingDetail.setSecurePaperTicket(false);
	    	issuingDetail.setActivated(true);
	    	issuingDetail.setIssuedOnLine(12L);	
		}
	    
		private static void addTicket(DocumentData dd) {		
			
	    	TicketDetailData tdd = new TicketDetailData();
	    	DelayConfirmation ticket = new DelayConfirmation();
	    	ticket.setPlannedArrivalDay(12L);
	    	ticket.setPlannedArrivalTime(1000L);
	    	ticket.setDelay(31L);
	    	ticket.setInfoText("delay confirmation");
	    	ticket.setAffectedTickets(getAffectedTickets());
	    	ticket.setPlannedArrivalYear(2022L);
	    	ticket.setReferenceIA5("ABDJ12345");
	    	ticket.setStationNum(8000001L);
	    	ticket.setTrainCancelled(false);
	    	ticket.setTrainNum(Asn1BigInteger.toAsn1(100L));
	    	tdd.setDelayConfirmation(ticket);
	    	dd.setTicket(tdd);
		}
		
		private static SequenceOfTicketLinkType getAffectedTickets() {
			
			SequenceOfTicketLinkType lts = new SequenceOfTicketLinkType();
			TicketLinkType t1 = new TicketLinkType();
			t1.setReferenceNum(801234567890L);
			t1.setProductOwnerNum(1080L);
			lts.add(t1);
			return lts;
			
		}


	    
	    private static void populateTravelerData(TravelerData td) {
	    	SequenceOfTravelerType trs = new SequenceOfTravelerType();
	    	TravelerType tr = new TravelerType();
	    	tr.setIdCard("12345");
	    	tr.setFirstName("John");
	    	tr.setSecondName("Dow");
	    	tr.setTicketHolder(true);
	    	SequenceOfCustomerStatusType ts = new SequenceOfCustomerStatusType();  	
	    	CustomerStatusType cst = new CustomerStatusType();
	    	cst.setCustomerStatusDescr("employee");
	    	ts.add(cst);
	    	tr.setStatus(ts);
	    	trs.add(tr);
	    	td.setTraveler(trs);
		}

	    



	    private static void populateExtensionSequence(SequenceOfExtensionData ed) {
	       	ExtensionData ed1 = new ExtensionData();
	    	ed1.setExtensionId("1");
	    	byte[] ba1 = { (byte) 0x82, (byte) 0xDA };
	    	ed1.setExtensionData(ba1); 	
	    	ExtensionData ed2 = new ExtensionData();    	
	    	ed2.setExtensionId("2");
	    	byte[] ba2 = { (byte) 0x83, (byte) 0xDA };
	    	ed2.setExtensionData(ba2);     	
	    	ed.add(ed1);
	    	ed.add(ed2);
		}

		private static void populate(ControlData controlDetail) {
			controlDetail.infoText = "cd";
			controlDetail.setAgeCheckRequired(false);
			controlDetail.setIdentificationByIdCard(false);
			controlDetail.setIdentificationByPassportId(false);
			controlDetail.setOnlineValidationRequired(false);
			controlDetail.setPassportValidationRequired(false);
			controlDetail.setReductionCardCheckRequired(false);
			controlDetail.setIdentificationByCardReference(new SequenceOfCardReferenceType());
			controlDetail.getIdentificationByCardReference().add(populateCardRefrence());
		}


		private static CardReferenceType populateCardRefrence() {
			CardReferenceType cr = new CardReferenceType();
			cr.setTrailingCardIdNum(100L);
			return cr;
		}






	}

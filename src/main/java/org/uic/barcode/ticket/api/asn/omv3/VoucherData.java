/*
 *   This file was generated by openASN.1 - an open source ASN.1 toolkit for java
 *
 *   openASN.1 is Copyright (C) 2007 Clayton Hoss, Marc Weyland
 *
 *   openASN.1 is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as
 *   published by the Free Software Foundation, either version 3 of
 *   the License, or (at your option) any later version.
 *
 *   openASN.1 is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with openASN.1. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.uic.barcode.ticket.api.asn.omv3;

import java.util.Calendar;
import java.util.Date;

import org.uic.barcode.asn1.datatypes.Asn1BigInteger;
import org.uic.barcode.asn1.datatypes.Asn1Default;
import org.uic.barcode.asn1.datatypes.Asn1Optional;
import org.uic.barcode.asn1.datatypes.CharacterRestriction;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.HasExtensionMarker;
import org.uic.barcode.asn1.datatypes.IntRange;
import org.uic.barcode.asn1.datatypes.RestrictedString;
import org.uic.barcode.asn1.datatypes.Sequence;


@Sequence
@HasExtensionMarker
public class VoucherData extends Object {
	public VoucherData() {
	}

	@FieldOrder(order = 0)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String referenceIA5;

	@FieldOrder(order = 1)
	@Asn1Optional public Asn1BigInteger referenceNum;

	@FieldOrder(order = 2)
	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public Long productOwnerNum;

	@FieldOrder(order = 3)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productOwnerIA5;

	@FieldOrder(order = 4)
	@IntRange(minValue=0,maxValue=65535)
	@Asn1Optional public Long productIdNum;

	@FieldOrder(order = 5)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productIdIA5;

	@FieldOrder(order = 6)
	@IntRange(minValue=2016,maxValue=2269)
	public Long validFromYear;

	@FieldOrder(order = 7)
	@IntRange(minValue=0,maxValue=370)
	public Long validFromDay;

	@FieldOrder(order = 8)
	@IntRange(minValue=2016,maxValue=2269)
	public Long validUntilYear;

	@FieldOrder(order = 9)
	@IntRange(minValue=0,maxValue=370)
	public Long validUntilDay;

	@FieldOrder(order = 10)
	@Asn1Default("0")
	@Asn1Optional public Long value;

	@FieldOrder(order = 11)
	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public Long type;

	@FieldOrder(order = 12)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String infoText;

	@FieldOrder(order = 13)
	@Asn1Optional public ExtensionData extension;
	

	public String getReferenceIA5() {

		return this.referenceIA5;
	}

	public Asn1BigInteger getReferenceNum() {

		return this.referenceNum;
	}

	public Long getProductOwnerNum() {

		return this.productOwnerNum;
	}

	public String getProductOwnerIA5() {

		return this.productOwnerIA5;
	}

	public Long getProductIdNum() {

		return this.productIdNum;
	}

	public String getProductIdIA5() {

		return this.productIdIA5;
	}

	public Long getValidFromYear() {

		return this.validFromYear;
	}

	public Long getValidFromDay() {

		return this.validFromDay;
	}

	public Long getValidUntilYear() {

		return this.validUntilYear;
	}

	public Long getValidUntilDay() {

		return this.validUntilDay;
	}

	public Long getValue() {

		return this.value;
	}

	public Long getType() {

		return this.type;
	}

	public String getInfoText() {

		return this.infoText;
	}

	public ExtensionData getExtension() {

		return this.extension;
	}

	public void setReferenceIA5(String referenceIA5) {

		this.referenceIA5 = referenceIA5;
	}

	public void setReferenceNum(Asn1BigInteger referenceNum) {

		this.referenceNum = referenceNum;
	}

	public void setProductOwnerNum(Long productOwnerNum) {

		this.productOwnerNum = productOwnerNum;
	}

	public void setProductOwnerIA5(String productOwnerIA5) {

		this.productOwnerIA5 = productOwnerIA5;
	}

	public void setProductIdNum(Long productIdNum) {

		this.productIdNum = productIdNum;
	}

	public void setProductIdIA5(String productIdIA5) {

		this.productIdIA5 = productIdIA5;
	}

	public void setValidFromYear(Long validFromYear) {

		this.validFromYear = validFromYear;
	}

	public void setValidFromDay(Long validFromDay) {

		this.validFromDay = validFromDay;
	}

	public void setValidUntilYear(Long validUntilYear) {

		this.validUntilYear = validUntilYear;
	}

	public void setValidUntilDay(Long validUntilDay) {

		this.validUntilDay = validUntilDay;
	}

	public void setValue(Long value) {

		this.value = value;
	}

	public void setType(Long type) {

		this.type = type;
	}

	public void setInfoText(String infoText) {

		this.infoText = infoText;
	}

	public void setExtension(ExtensionData extension) {

		this.extension = extension;
	}
	
	
	public void setValidity (Date fromDate , Date untilDate){
		
		Calendar fromCal = Calendar.getInstance();
		fromCal.clear();
		fromCal.setTime(fromDate);
		
		this.validFromYear = new Long( fromCal.get(Calendar.YEAR));
		this.validFromDay = new Long (fromCal.get(Calendar.DAY_OF_YEAR));
		
		if (untilDate == null) return;

		Calendar untilCal = Calendar.getInstance();
		untilCal.clear();
		untilCal.setTime(untilDate);
		
		this.validUntilYear = new Long( untilCal.get(Calendar.YEAR));
		this.validUntilDay = new Long (untilCal.get(Calendar.DAY_OF_YEAR));
		
	}
	
	
	public void setValidFrom (Date fromDate){
		
		if (fromDate == null) return;
		
		Calendar fromCal = Calendar.getInstance();
		fromCal.clear();
		fromCal.setTime(fromDate);
		
		this.validFromYear = new Long( fromCal.get(Calendar.YEAR));
		this.validFromDay = new Long (fromCal.get(Calendar.DAY_OF_YEAR));
		
	}
	
	public void setValidUntil (Date untilDate){
		
		if (untilDate == null) return;
		
		Calendar untilCal = Calendar.getInstance();
		untilCal.clear();
		untilCal.setTime(untilDate);
		
		this.validUntilYear = new Long( untilCal.get(Calendar.YEAR));
		this.validUntilDay = new Long (untilCal.get(Calendar.DAY_OF_YEAR));
		
	}	
	
	public Date getValidFrom(){
		
		if (this.validFromYear == null || this.validFromYear == 0) return null;
		
		Calendar cal = Calendar.getInstance();
		cal.clear();
		//cal.setTimeZone(TimeZone.getTimeZone("UTC"));
		cal.set(Calendar.YEAR, this.validFromYear.intValue());
		cal.set(Calendar.DAY_OF_YEAR, this.validFromDay.intValue());
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.HOUR_OF_DAY,0);

		return cal.getTime();
		
	}
	
	public Date getValidUntil(){
		
		if (this.validUntilYear == null || this.validUntilYear == 0) return null;
		
		Calendar cal = Calendar.getInstance();
		cal.clear();
		//cal.setTimeZone(TimeZone.getTimeZone("UTC"));
		cal.set(Calendar.YEAR, this.validUntilYear.intValue());
		cal.set(Calendar.DAY_OF_YEAR, this.validUntilDay.intValue());
		cal.set(Calendar.MINUTE,59);
		cal.set(Calendar.HOUR_OF_DAY,23);

		return cal.getTime();
		
	}


}

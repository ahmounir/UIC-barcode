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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.uic.barcode.asn1.datatypes.Asn1BigInteger;
import org.uic.barcode.asn1.datatypes.Asn1Default;
import org.uic.barcode.asn1.datatypes.Asn1Optional;
import org.uic.barcode.asn1.datatypes.CharacterRestriction;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.HasExtensionMarker;
import org.uic.barcode.asn1.datatypes.IntRange;
import org.uic.barcode.asn1.datatypes.RestrictedString;
import org.uic.barcode.asn1.datatypes.Sequence;
import org.uic.barcode.asn1.datatypesimpl.SequenceOfStringIA5;
import org.uic.barcode.ticket.api.utils.DateTimeUtils;

@Sequence
@HasExtensionMarker
public class FIPTicketData extends Object {
	public FIPTicketData() {
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
	@IntRange(minValue=-367,maxValue=700)
	@Asn1Default("0")
	@Asn1Optional public Long validFromDay;

	@FieldOrder(order = 7)
	@IntRange(minValue=-1,maxValue=370)
	@Asn1Default("0")
	@Asn1Optional public Long validUntilDay;

	@FieldOrder(order = 8)
	@Asn1Optional public SequenceOfActivatedDays activatedDay;

	@FieldOrder(order = 9)
	@Asn1Optional public SequenceOfCarrierNum carrierNum;

	@FieldOrder(order = 10)
	@Asn1Optional public SequenceOfStringIA5 carrierIA5;

	@FieldOrder(order = 11)
	@IntRange(minValue=1,maxValue=200)
	public Long numberOfTravelDays;

	@FieldOrder(order = 12)
	public Boolean includesSupplements = false;

	@FieldOrder(order = 13)
	@Asn1Default(value="second")
	@Asn1Optional public TravelClassType classCode;

	@FieldOrder(order = 14)
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

	public Long getValidFromDay() {

		return this.validFromDay;
	}

	public Long getValidUntilDay() {

		return this.validUntilDay;
	}

	public List<Long> getActivatedDay() {

		return this.activatedDay;
	}

	public List<Long> getCarrierNum() {

		return this.carrierNum;
	}

	public List<String> getCarrierIA5() {

		return this.carrierIA5;
	}

	public Long getNumberOfTravelDays() {

		return this.numberOfTravelDays;
	}

	public Boolean getIncludesSupplements() {

		return this.includesSupplements;
	}

	public TravelClassType getClassCode() {
		if (classCode == null) return TravelClassType.second;		
		return this.classCode;
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

	public void setValidFromDay(Long validFromDay) {

		this.validFromDay = validFromDay;
	}

	public void setValidUntilDay(Long validUntilDay) {

		this.validUntilDay = validUntilDay;
	}

	public void setActivatedDay(SequenceOfActivatedDays activatedDay) {

		this.activatedDay = activatedDay;
	}

	public void setCarrierNum(SequenceOfCarrierNum carrierNum) {

		this.carrierNum = carrierNum;
	}

	public void setCarrierIA5(SequenceOfStringIA5 carrierIA5) {

		this.carrierIA5 = carrierIA5;
	}

	public void setNumberOfTravelDays(Long numberOfTravelDays) {

		this.numberOfTravelDays = numberOfTravelDays;
	}

	public void setIncludesSupplements(Boolean includesSupplements) {

		this.includesSupplements = includesSupplements;
	}

	public void setClassCode(TravelClassType classCode) {
		this.classCode = classCode;
	}

	public void setExtension(ExtensionData extension) {

		this.extension = extension;
	}
	
	public void setValidityDates (Date fromDate, Date untilDate, Date issuingDate){
		
		if (issuingDate == null || fromDate == null) return;
				
		this.validFromDay = DateTimeUtils.getDateDifference(issuingDate,fromDate);
		
		if (untilDate != null){
			this.validUntilDay = DateTimeUtils.getDateDifference(fromDate, untilDate);
		}

	}
	
	public Date getValidFromDate(Date issuingDate){
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay,0L);
		
	}
	
	public Date getValidUntilDate(Date issuingDate){
		
		if (issuingDate == null) return null;
		
		if (this.validFromDay == null) {
			this.validFromDay = 0L;
		}
		
		if (this.validUntilDay == null) {
			return null;
		}		
		
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay + this.validUntilDay, 1439L);
		
	}
	
	public void addActivatedDays(Collection<Long> days) {
		
		if (days == null  || days.isEmpty()) return;
		
		if (this.activatedDay == null) {
			this.activatedDay = new SequenceOfActivatedDays();
		}
		
		for (Long l : days) {
			this.activatedDay.add(l);
		}
		
	}
	
	public void addActivatedDay(Date issuingDate, Date day){
		
		Long dayDiff = DateTimeUtils.getDateDifference(issuingDate, day);
		
		if (this.activatedDay == null) {
			this.activatedDay = new SequenceOfActivatedDays();
		}
		
		if (dayDiff != null) {
			this.activatedDay.add(dayDiff);
		}
		
	}
	
	/**
	 * Gets the activated days.
	 *
	 * @param issuingDate the issuing date
	 * @return the activated days
	 */
	public Collection<Date> getActivatedDays(Date issuingDate) {
		
		if (this.activatedDay == null) return null;
		
		ArrayList<Date> dates = new ArrayList<Date>();
		
		for (Long diff: this.getActivatedDay()) {
			
			Date day = DateTimeUtils.getDate(this.getValidFromDate(issuingDate), diff, null);
			
			if (day != null) {
				dates.add(day);
			}
			
		}
				
		return dates;
		
	}	
	
	
}

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
import org.uic.barcode.asn1.datatypes.SizeRange;
import org.uic.barcode.asn1.datatypesimpl.SequenceOfStringIA5;
import org.uic.barcode.ticket.api.asn.omv3.SequenceOfActivatedDays;
import org.uic.barcode.ticket.api.utils.DateTimeUtils;

@Sequence
@HasExtensionMarker
public class OpenTicketData extends Object {
	public OpenTicketData() {
	}

	@FieldOrder(order = 0)
	@Asn1Optional public Asn1BigInteger referenceNum;

	@FieldOrder(order = 1)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String referenceIA5;

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
	@Asn1Optional public Asn1BigInteger externalIssuerId;

	@FieldOrder(order = 7)
	@Asn1Optional public Asn1BigInteger issuerAutorizationId;

	@FieldOrder(order = 8)
	public Boolean returnIncluded = false;

	@FieldOrder(order = 9)
	@Asn1Default("stationUIC")
	@Asn1Optional public CodeTableType stationCodeTable;

	@FieldOrder(order = 10)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long fromStationNum;

	@FieldOrder(order = 11)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String fromStationIA5;

	@FieldOrder(order = 12)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long toStationNum;

	@FieldOrder(order = 13)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String toStationIA5;

	@FieldOrder(order = 14)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String fromStationNameUTF8;

	@FieldOrder(order = 15)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String toStationNameUTF8;

	@FieldOrder(order = 16)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String validRegionDesc;

	@FieldOrder(order = 17)
	@Asn1Optional public SequenceOfRegionalValidityType validRegion;

	@FieldOrder(order = 18)
	@Asn1Optional public ReturnRouteDescriptionType returnDescription;

	@FieldOrder(order = 19)
	@Asn1Default(value = "0")
	@IntRange(minValue=-367,maxValue=700)
	@Asn1Optional public Long validFromDay;

	@FieldOrder(order = 20)
	@IntRange(minValue=0,maxValue=1439)
	@Asn1Optional public Long validFromTime;
	
	@FieldOrder(order = 21)
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long validFromUTCOffset;

	@FieldOrder(order = 22)
	@Asn1Default(value = "0")
	@IntRange(minValue=-1,maxValue=370)
	@Asn1Optional public Long validUntilDay;

	@FieldOrder(order = 23)
	@IntRange(minValue=0,maxValue=1439)
	@Asn1Optional public Long validUntilTime;
	
	@FieldOrder(order = 24)
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long validUntilUTCOffset;

	@FieldOrder(order = 25)
	@Asn1Optional public SequenceOfActivatedDays activatedDay;

	@FieldOrder(order = 26)
	@Asn1Default(value="second")
	@Asn1Optional public TravelClassType classCode;

	@FieldOrder(order = 27)
	@SizeRange(minValue = 1, maxValue = 2)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String serviceLevel;

	@FieldOrder(order = 28)
	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public SequenceOfCarrierNum carrierNum;

	@FieldOrder(order = 29)
	@Asn1Optional public SequenceOfStringIA5 carrierIA5;

	@FieldOrder(order = 30)
	@Asn1Optional public SequenceOfServiceBrands includedServiceBrands;

	@FieldOrder(order = 31)
	@Asn1Optional public SequenceOfServiceBrands excludedServiceBrands;

	@FieldOrder(order = 32)
	@Asn1Optional public SequenceOfTariffType tariffs;
	
	@FieldOrder(order = 33)	
	@Asn1Optional Asn1BigInteger price;
	
	@FieldOrder(order = 34)
	@Asn1Optional SequenceOfVatDetail vatDetails;

	@FieldOrder(order = 35)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String infoText;

	@FieldOrder(order = 36)
	@Asn1Optional public SequenceOfIncludedOpenTicketType includedAddOns;

	@FieldOrder(order = 37)
	@Asn1Optional public LuggageRestrictionType luggage;
	
	@FieldOrder(order = 38)
	@Asn1Optional public SequenceOfTransportTypes includedTransportTypes;

	@FieldOrder(order = 39)
	@Asn1Optional public SequenceOfTransportTypes excludedTransportTypes;	
	
	@FieldOrder(order = 40)
	@Asn1Optional public ExtensionData extension;
	
	

	
	public Long getReferenceNum() {
		return Asn1BigInteger.toLong(this.referenceNum);
	}

	public String getReferenceIA5() {

		return this.referenceIA5;
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

	public Long getExtIssuerId() {

		return Asn1BigInteger.toLong(externalIssuerId);
	}

	public Long getIssuerAutorizationId() {

		return Asn1BigInteger.toLong(issuerAutorizationId);
	}

	public Boolean getReturnIncluded() {

		return this.returnIncluded;
	}

	public CodeTableType getStationCodeTable() {

		if (stationCodeTable == null) {
			return CodeTableType.stationUIC;
		}
		
		
		return this.stationCodeTable;
	}

	public Long getFromStationNum() {

		return this.fromStationNum;
	}

	public String getFromStationIA5() {

		return this.fromStationIA5;
	}

	public Long getToStationNum() {

		return this.toStationNum;
	}

	public String getToStationIA5() {

		return this.toStationIA5;
	}

	public String getFromStationNameUTF8() {

		return this.fromStationNameUTF8;
	}

	public String getToStationNameUTF8() {

		return this.toStationNameUTF8;
	}

	public String getValidRegionDesc() {

		return this.validRegionDesc;
	}

	public List<RegionalValidityType> getValidRegion() {

		return this.validRegion;
	}

	public ReturnRouteDescriptionType getReturnDescription() {

		return this.returnDescription;
	}

	public Long getValidFromDay() {

		return this.validFromDay;
	}

	public Long getValidFromTime() {

		return this.validFromTime;
	}

	public Long getValidUntilDay() {

		return this.validUntilDay;
	}

	public Long getValidUntilTime() {

		return this.validUntilTime;
	}

	public List<Long> getActivatedDay() {

		return this.activatedDay;
	}

	public TravelClassType getClassCode() {

		if (classCode == null) {
			return TravelClassType.second;
		}
		
		return this.classCode;
	}

	public String getServiceLevel() {

		return this.serviceLevel;
	}

	public List<Long> getCarriersNum() {

		return this.carrierNum;
	}

	public List<String> getCarriersIA5() {

		return this.carrierIA5;
	}

	public List<Long> getIncludedServiceBrands() {

		return this.includedServiceBrands;
	}

	public List<Long> getExcludedServiceBrands() {

		return this.excludedServiceBrands;
	}

	public List<TariffType> getTariffs() {

		return this.tariffs;
	}

	public String getInfoText() {

		return this.infoText;
	}

	public List<IncludedOpenTicketType> getIncludedAddOns() {

		return this.includedAddOns;
	}

	public LuggageRestrictionType getLuggage() {

		return this.luggage;
	}

	public ExtensionData getExtension() {

		return this.extension;
	}

	public void setReferenceNum(Long referenceNum) {
		this.referenceNum = Asn1BigInteger.toAsn1(referenceNum);
	}

	public void setReferenceIA5(String referenceIA5) {

		this.referenceIA5 = referenceIA5;
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

	public void setExtIssuerId(Long extIssuerId) {
		this.externalIssuerId = Asn1BigInteger.toAsn1(extIssuerId);
	}

	public void setIssuerAutorizationId(Long issuerAutorizationId) {

		this.issuerAutorizationId = Asn1BigInteger.toAsn1(issuerAutorizationId);
	}

	public void setReturnIncluded(Boolean returnIncluded) {
		this.returnIncluded = returnIncluded;
	}

	public void setStationCodeTable(CodeTableType stationCodeTable) {
		this.stationCodeTable = stationCodeTable;
	}

	public void setFromStationNum(Long fromStationNum) {
		this.fromStationNum = fromStationNum;
	}

	public void setFromStationIA5(String fromStationIA5) {
		this.fromStationIA5 = fromStationIA5;
	}

	public void setToStationNum(Long toStationNum) {
		this.toStationNum = toStationNum;
	}

	public void setToStationIA5(String toStationIA5) {
		this.toStationIA5 = toStationIA5;
	}

	public void setFromStationNameUTF8(String fromStationNameUTF8) {
		this.fromStationNameUTF8 = fromStationNameUTF8;
	}

	public void setToStationNameUTF8(String toStationNameUTF8) {
		this.toStationNameUTF8 = toStationNameUTF8;
	}

	public void setValidRegionDesc(String validRegionDesc) {
		this.validRegionDesc = validRegionDesc;
	}

	public void setValidRegion(SequenceOfRegionalValidityType validRegion) {
		this.validRegion = validRegion;
	}

	public void setReturnDescription(ReturnRouteDescriptionType returnDescription) {
		this.returnDescription = returnDescription;
	}

	public void setValidFromDay(Long validFromDay) {
		this.validFromDay = validFromDay;
	}

	public void setValidFromTime(Long validFromTime) {
		this.validFromTime = validFromTime;
	}

	public void setValidUntilDay(Long validUntilDay) {
		this.validUntilDay = validUntilDay;
	}

	public void setValidUntilTime(Long validUntilTime) {
		this.validUntilTime = validUntilTime;
	}

	public void setActivatedDay(SequenceOfActivatedDays activatedDay) {
		this.activatedDay = activatedDay;
	}

	public void setClassCode(TravelClassType classCode) {
		this.classCode = classCode;
	}

	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public void setCarriersNum(SequenceOfCarrierNum carriersNum) {

		this.carrierNum = carriersNum;
	}

	public void setCarriersIA5(SequenceOfStringIA5 carriersIA5) {
		this.carrierIA5 = carriersIA5;
	}

	public void setIncludedServiceBrands(SequenceOfServiceBrands includedServiceBrands) {
		this.includedServiceBrands = includedServiceBrands;
	}

	public void setExcludedServiceBrands(SequenceOfServiceBrands excludedServiceBrands) {
		this.excludedServiceBrands = excludedServiceBrands;
	}


	public SequenceOfTransportTypes getIncludedTransportTypes() {
		return includedTransportTypes;
	}

	public void setIncludedTransportTypes(SequenceOfTransportTypes includedTransportTypes) {
		this.includedTransportTypes = includedTransportTypes;
	}

	public SequenceOfTransportTypes getExcludedTransportTypes() {
		return excludedTransportTypes;
	}

	public void setExcludedTransportTypes(SequenceOfTransportTypes excludedTransportTypes) {
		this.excludedTransportTypes = excludedTransportTypes;
	}

	public void setTariffs(SequenceOfTariffType tariffs) {
		this.tariffs = tariffs;
	}

	public void setInfoText(String infoText) {

		this.infoText = infoText;
	}

	public void setIncludedAddOns(SequenceOfIncludedOpenTicketType includedAddOns) {
		this.includedAddOns = includedAddOns;
	}

	public void setLuggage(LuggageRestrictionType luggage) {
		this.luggage = luggage;
	}

	public void setExtension(ExtensionData extension) {
		this.extension = extension;
	}

	public Long getPrice() {
		return Asn1BigInteger.toLong(price);
	}

	public void setPrice(Long price) {
		this.price = Asn1BigInteger.toAsn1(price);
	}

	public SequenceOfVatDetail getVatDetails() {
		return vatDetails;
	}

	public void setVatDetails(SequenceOfVatDetail vatDetails) {
		this.vatDetails = vatDetails;
	}

	public void addVatDetail(VatDetailType vatDetail) {
		if (this.vatDetails == null) {
			this.vatDetails = new SequenceOfVatDetail();
		}
		this.vatDetails.add(vatDetail);
	}

	public void setValidityDates (Date fromDate, Date untilDate, Date issuingDate){
		
		if (issuingDate == null || fromDate == null) return;
				
		this.validFromDay = DateTimeUtils.getDateDifference(issuingDate,fromDate);
		this.validFromTime =  DateTimeUtils.getTime(fromDate);

		if (untilDate != null){
			this.validUntilDay = DateTimeUtils.getDateDifference(fromDate, untilDate);
			this.validUntilTime = DateTimeUtils.getTime(untilDate);
		}

	}
	
	public Date getValidFromDate(Date issuingDate){
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay, this.validFromTime);
		
	}
	
	public Date getValidUntilDate(Date issuingDate){
		
		if (issuingDate == null) return null;
		
		if (this.validFromDay == null) {
			this.validFromDay = 0L;
		}
		
		if (this.validUntilDay == null) {
			return null;
		}		
		
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay + this.validUntilDay, this.validUntilTime);
		
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
	
	public Long getValidFromUTCOffset() {
		return validFromUTCOffset;
	}

	public void setValidFromUTCOffset(Long validFromUTCOffset) {
		this.validFromUTCOffset = validFromUTCOffset;
	}

	public Long getValidUntilUTCOffset() {
		return validUntilUTCOffset;
	}

	public void setValidUntilUTCOffset(Long validUntilUTCOffset) {
		this.validUntilUTCOffset = validUntilUTCOffset;
	}
	
	

}

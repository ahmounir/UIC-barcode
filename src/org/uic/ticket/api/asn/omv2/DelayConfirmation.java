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
package org.uic.ticket.api.asn.omv2;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import net.gcdc.asn1.datatypes.Asn1BigInteger;
import net.gcdc.asn1.datatypes.Asn1Default;

import net.gcdc.asn1.datatypes.Asn1Optional;
import net.gcdc.asn1.datatypes.CharacterRestriction;
import net.gcdc.asn1.datatypes.FieldOrder;
import net.gcdc.asn1.datatypes.HasExtensionMarker;
import net.gcdc.asn1.datatypes.IntRange;
import net.gcdc.asn1.datatypes.RestrictedString;
import net.gcdc.asn1.datatypes.Sequence;


@Sequence
@HasExtensionMarker
public class DelayConfirmation extends Object {
	public DelayConfirmation() {
	}

	@FieldOrder(order = 0)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String referenceIA5;

	@FieldOrder(order = 1)
	@Asn1Optional public Asn1BigInteger referenceNum;

	@FieldOrder(order = 2)
	@Asn1Optional public Asn1BigInteger trainNum;

	@FieldOrder(order = 3)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String trainIA5;

	@FieldOrder(order = 4)
	@IntRange(minValue=2016, maxValue=2269)
	@Asn1Optional public Long plannedArrivalYear;

	@FieldOrder(order = 5)
	@IntRange(minValue=1, maxValue=366)
	@Asn1Optional public Long plannedArrivalDay;

	@FieldOrder(order = 6)
	@IntRange(minValue=0, maxValue=1439)
	@Asn1Optional public Long plannedArrivalTime;
	
	@FieldOrder(order = 7)
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long departureUTCOffset;

	@FieldOrder(order = 8)
	@Asn1Default(value="stationUIC")
	@Asn1Optional public CodeTableType stationCodeTable;

	@FieldOrder(order = 9)
	@IntRange(minValue=1, maxValue=9999999)
	@Asn1Optional public Long stationNum;

	@FieldOrder(order = 10)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String stationIA5;

	@FieldOrder(order = 11)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String stationNameUTF8;

	@FieldOrder(order = 12)
	@IntRange(minValue=0, maxValue=999, hasExtensionMarker=false)
	@Asn1Optional public Long delay;

	@FieldOrder(order = 13)
	@Asn1Optional public Boolean trainCancelled = false;

	@FieldOrder(order = 14)
	@Asn1Default(value="travelerDelayConfirmation")
	@Asn1Optional public ConfirmationTypeType confirmationType;

	@FieldOrder(order = 15)
	@Asn1Optional public SequenceOfTicketLinkType affectedTickets;

	@FieldOrder(order = 16)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String infoText;

	@FieldOrder(order = 17)
	@Asn1Optional public ExtensionData extension;
	


	public String getReferenceIA5() {
		
		return this.referenceIA5;
	}
	
	public Asn1BigInteger getReferenceNum() {
		
		return this.referenceNum;
	}
	
	public Long getTrainNum() {
		
		return Asn1BigInteger.toLong(this.trainNum);
	}
	
	public String getTrainIA5() {
		
		return this.trainIA5;
	}
	
	public Long getPlannedArrivalYear() {
		
		return this.plannedArrivalYear;
	}
	
	public Long getPlannedArrivalDay() {
		
		return this.plannedArrivalDay;
	}
	
	public Long getPlannedArrivalTime() {
		
		return this.plannedArrivalTime;
	}
	
	public CodeTableType getStationCodeTable() {

		if (stationCodeTable == null){
			return CodeTableType.stationUIC;
		}
		return this.stationCodeTable;
	}
	
	public Long getStationNum() {
		
		return this.stationNum;
	}
	
	public String getStationIA5() {
		
		return this.stationIA5;
	}
	
	public String getStationNameUTF8() {
		
		return this.stationNameUTF8;
	}
	
	public Long getDelay() {
		
		return this.delay;
	}
	
	public Boolean getTrainCancelled() {
		
		return this.trainCancelled;
	}
	
	public ConfirmationTypeType getConfirmationType() {
		
		if (confirmationType == null){
			return ConfirmationTypeType.trainDelayConfirmation;
		}
		
		return this.confirmationType;
	}
	
	public List<TicketLinkType> getAffectedTickets() {
		
		return this.affectedTickets;
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
	
	public void setReferenceNum(Long referenceNum) {
		this.referenceNum = Asn1BigInteger.toAsn1(referenceNum);
	}

	public void setTrainNum(Asn1BigInteger trainNum) {
		
		this.trainNum = trainNum;
	}

	public void setTrainIA5(String trainIA5) {
		
		this.trainIA5 = trainIA5;
	}

	public void setPlannedArrivalYear(Long plannedArrivalYear) {
		
		this.plannedArrivalYear = plannedArrivalYear;
	}

	public void setPlannedArrivalDay(Long plannedArrivalDay) {
		
		this.plannedArrivalDay = plannedArrivalDay;
	}

	public void setPlannedArrivalTime(Long plannedArrivalTime) {
		
		this.plannedArrivalTime = plannedArrivalTime;
	}

	public void setStationCodeTable(CodeTableType stationCodeTable) {
		
		this.stationCodeTable = stationCodeTable;
	}

	public void setStationNum(Long stationNum) {
		
		this.stationNum = stationNum;
	}

	public void setStationIA5(String stationIA5) {
		
		this.stationIA5 = stationIA5;
	}

	public void setStationNameUTF8(String stationNameUTF8) {
		
		this.stationNameUTF8 = stationNameUTF8;
	}

	public void setDelay(Long delay) {
		
		this.delay = delay;
	}

	public void setTrainCancelled(Boolean trainCancelled) {
		
		this.trainCancelled = trainCancelled;
	}

	public void setConfirmationType(ConfirmationTypeType confirmationType) {
		
		this.confirmationType = confirmationType;
	}

	public void setAffectedTickets(SequenceOfTicketLinkType affectedTickets) {
		
		this.affectedTickets = affectedTickets;
	}

	public void setInfoText(String infoText) {
		
		this.infoText = infoText;
	}

	public void setExtension(ExtensionData extension) {
		
		this.extension = extension;
	}

	public void setPlannedArrivalDate(Date date){
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		this.plannedArrivalYear = new Long( cal.get(Calendar.YEAR));
		this.plannedArrivalDay = new Long (cal.get(Calendar.DAY_OF_YEAR));
		int time =  cal.get(Calendar.HOUR_OF_DAY) * 60 + cal.get(Calendar.MINUTE);
		if (time > 0) {
			this.plannedArrivalTime = new Long (time );
		}
		
	}
	
	public Date getPlannedArrivalDate() {
		
		if (this.plannedArrivalYear == null || this.plannedArrivalDay == null) return null;
		
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.setTimeZone(TimeZone.getTimeZone("UTC"));
		cal.set(Calendar.YEAR, this.plannedArrivalYear.intValue());
		cal.set(Calendar.DAY_OF_YEAR, this.plannedArrivalDay.intValue());
		
		if (this.plannedArrivalTime != null) {
		
			int hours = this.plannedArrivalTime.intValue() / 60;
			int minutes = this.plannedArrivalTime.intValue() % 60;
			cal.set(Calendar.HOUR_OF_DAY, hours);
			cal.set(Calendar.MINUTE,minutes);

		}
		
		return cal.getTime();
	}

	public Long getDepartureUTCOffset() {
		return departureUTCOffset;
	}

	public void setDepartureUTCOffset(Long departureUTCOffset) {
		this.departureUTCOffset = departureUTCOffset;
	}
	
	
	
}

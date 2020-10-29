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

import net.gcdc.asn1.datatypes.Asn1BigInteger;

import net.gcdc.asn1.datatypes.Asn1Optional;
import net.gcdc.asn1.datatypes.CharacterRestriction;
import net.gcdc.asn1.datatypes.FieldOrder;
import net.gcdc.asn1.datatypes.IntRange;
import net.gcdc.asn1.datatypes.RestrictedString;
import net.gcdc.asn1.datatypes.Sequence;



@Sequence
public class CustomerStatusType extends Object {
	public CustomerStatusType() {
	}

	@FieldOrder(order = 0)
	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public Long statusProviderNum;

	@FieldOrder(order = 1)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String statusProviderIA5;

	@FieldOrder(order = 2)
	@Asn1Optional public Asn1BigInteger customerStatus;

	@FieldOrder(order = 3)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String customerStatusDescr;

	public Long getStatusProviderNum() {

		return this.statusProviderNum;
	}

	public String getStatusProviderIA5() {

		return this.statusProviderIA5;
	}

	public Long getCustomerStatus() {

		return Asn1BigInteger.toLong(this.customerStatus);
	}

	public String getCustomerStatusDescr() {

		return this.customerStatusDescr;
	}

	public void setStatusProviderNum(Long statusProviderNum) {

		this.statusProviderNum = statusProviderNum;
	}

	public void setStatusProviderIA5(String statusProviderIA5) {

		this.statusProviderIA5 = statusProviderIA5;
	}

	public void setCustomerStatus(Long customerStatus) {

		this.customerStatus = Asn1BigInteger.toAsn1(customerStatus);
	}

	public void setCustomerStatusDescr(String customerStatusDescr) {

		this.customerStatusDescr = customerStatusDescr;
	}


}

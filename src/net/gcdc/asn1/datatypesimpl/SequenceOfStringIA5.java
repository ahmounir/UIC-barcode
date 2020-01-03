package net.gcdc.asn1.datatypesimpl;

import java.util.Collection;

import net.gcdc.asn1.datatypes.Asn1SequenceOf;
import net.gcdc.asn1.datatypes.CharacterRestriction;
import net.gcdc.asn1.datatypes.RestrictedString;

@RestrictedString(CharacterRestriction.IA5String)
public class SequenceOfStringIA5 extends Asn1SequenceOf<String> {
    public SequenceOfStringIA5() { super(); }
    public SequenceOfStringIA5(Collection<String> coll) { super(coll); }
}	

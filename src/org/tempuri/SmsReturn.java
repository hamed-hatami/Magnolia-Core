/**
 * SmsReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SmsReturn implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SmsReturn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Successful = "Successful";
    public static final java.lang.String _UnknownError = "UnknownError";
    public static final java.lang.String _InsufficientCredit = "InsufficientCredit";
    public static final java.lang.String _ForbiddenHours = "ForbiddenHours";
    public static final java.lang.String _Filtered = "Filtered";
    public static final java.lang.String _NoFilters = "NoFilters";
    public static final java.lang.String _PrivateNumberIsDisable = "PrivateNumberIsDisable";
    public static final java.lang.String _ArgumentIsNullOrIncorrect = "ArgumentIsNullOrIncorrect";
    public static final java.lang.String _MessageBodyIsNullOrEmpty = "MessageBodyIsNullOrEmpty";
    public static final java.lang.String _PrivateNumberIsIncorrect = "PrivateNumberIsIncorrect";
    public static final java.lang.String _ReceptionNumberIsIncorrect = "ReceptionNumberIsIncorrect";
    public static final java.lang.String _SentTypeIsIncorrect = "SentTypeIsIncorrect";
    public static final java.lang.String _Warning = "Warning";
    public static final java.lang.String _PanelIsBlocked = "PanelIsBlocked";
    public static final java.lang.String _SiteUpdating = "SiteUpdating";
    public static final java.lang.String _AudioMessageNotAllowed = "AudioMessageNotAllowed";
    public static final java.lang.String _AudioMessageFileSizeNotAllowed = "AudioMessageFileSizeNotAllowed";
    public static final SmsReturn Successful = new SmsReturn(_Successful);
    public static final SmsReturn UnknownError = new SmsReturn(_UnknownError);
    public static final SmsReturn InsufficientCredit = new SmsReturn(_InsufficientCredit);
    public static final SmsReturn ForbiddenHours = new SmsReturn(_ForbiddenHours);
    public static final SmsReturn Filtered = new SmsReturn(_Filtered);
    public static final SmsReturn NoFilters = new SmsReturn(_NoFilters);
    public static final SmsReturn PrivateNumberIsDisable = new SmsReturn(_PrivateNumberIsDisable);
    public static final SmsReturn ArgumentIsNullOrIncorrect = new SmsReturn(_ArgumentIsNullOrIncorrect);
    public static final SmsReturn MessageBodyIsNullOrEmpty = new SmsReturn(_MessageBodyIsNullOrEmpty);
    public static final SmsReturn PrivateNumberIsIncorrect = new SmsReturn(_PrivateNumberIsIncorrect);
    public static final SmsReturn ReceptionNumberIsIncorrect = new SmsReturn(_ReceptionNumberIsIncorrect);
    public static final SmsReturn SentTypeIsIncorrect = new SmsReturn(_SentTypeIsIncorrect);
    public static final SmsReturn Warning = new SmsReturn(_Warning);
    public static final SmsReturn PanelIsBlocked = new SmsReturn(_PanelIsBlocked);
    public static final SmsReturn SiteUpdating = new SmsReturn(_SiteUpdating);
    public static final SmsReturn AudioMessageNotAllowed = new SmsReturn(_AudioMessageNotAllowed);
    public static final SmsReturn AudioMessageFileSizeNotAllowed = new SmsReturn(_AudioMessageFileSizeNotAllowed);
    public java.lang.String getValue() { return _value_;}
    public static SmsReturn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SmsReturn enumeration = (SmsReturn)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SmsReturn fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmsReturn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SmsReturn"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

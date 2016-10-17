/**
 * SmsStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SmsStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SmsStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotFound = "NotFound";
    public static final java.lang.String _DoNotSend = "DoNotSend";
    public static final java.lang.String _InQueue = "InQueue";
    public static final java.lang.String _Sent = "Sent";
    public static final java.lang.String _InsufficientCredit = "InsufficientCredit";
    public static final java.lang.String _Block = "Block";
    public static final java.lang.String _NotDeliverdSmsAdvertisingBlock = "NotDeliverdSmsAdvertisingBlock";
    public static final java.lang.String _NotDeliverdBlackList = "NotDeliverdBlackList";
    public static final java.lang.String _NotDeliverdDelay = "NotDeliverdDelay";
    public static final java.lang.String _NotDeliverdCanceled = "NotDeliverdCanceled";
    public static final java.lang.String _NotDeliverdNoViber = "NotDeliverdNoViber";
    public static final java.lang.String _NotDeliverdFiltering = "NotDeliverdFiltering";
    public static final java.lang.String _WaitingForRecheckInOprator = "WaitingForRecheckInOprator";
    public static final java.lang.String _OpratorFault = "OpratorFault";
    public static final java.lang.String _NotDeliveredBlocked = "NotDeliveredBlocked";
    public static final java.lang.String _SendedButStatusNotUpdated = "SendedButStatusNotUpdated";
    public static final java.lang.String _NotDeliveredDuplicate = "NotDeliveredDuplicate";
    public static final java.lang.String _NotDeliveredBlockPanel = "NotDeliveredBlockPanel";
    public static final java.lang.String _NotDeliveredUnknownNumber = "NotDeliveredUnknownNumber";
    public static final java.lang.String _WaitingForDeliveryBeforeSend = "WaitingForDeliveryBeforeSend";
    public static final java.lang.String _NotDeliveredUnAccessible = "NotDeliveredUnAccessible";
    public static final java.lang.String _NotDeliveredNotAnswered = "NotDeliveredNotAnswered";
    public static final java.lang.String _NotDeliveredLineIsBusy = "NotDeliveredLineIsBusy";
    public static final SmsStatus NotFound = new SmsStatus(_NotFound);
    public static final SmsStatus DoNotSend = new SmsStatus(_DoNotSend);
    public static final SmsStatus InQueue = new SmsStatus(_InQueue);
    public static final SmsStatus Sent = new SmsStatus(_Sent);
    public static final SmsStatus InsufficientCredit = new SmsStatus(_InsufficientCredit);
    public static final SmsStatus Block = new SmsStatus(_Block);
    public static final SmsStatus NotDeliverdSmsAdvertisingBlock = new SmsStatus(_NotDeliverdSmsAdvertisingBlock);
    public static final SmsStatus NotDeliverdBlackList = new SmsStatus(_NotDeliverdBlackList);
    public static final SmsStatus NotDeliverdDelay = new SmsStatus(_NotDeliverdDelay);
    public static final SmsStatus NotDeliverdCanceled = new SmsStatus(_NotDeliverdCanceled);
    public static final SmsStatus NotDeliverdNoViber = new SmsStatus(_NotDeliverdNoViber);
    public static final SmsStatus NotDeliverdFiltering = new SmsStatus(_NotDeliverdFiltering);
    public static final SmsStatus WaitingForRecheckInOprator = new SmsStatus(_WaitingForRecheckInOprator);
    public static final SmsStatus OpratorFault = new SmsStatus(_OpratorFault);
    public static final SmsStatus NotDeliveredBlocked = new SmsStatus(_NotDeliveredBlocked);
    public static final SmsStatus SendedButStatusNotUpdated = new SmsStatus(_SendedButStatusNotUpdated);
    public static final SmsStatus NotDeliveredDuplicate = new SmsStatus(_NotDeliveredDuplicate);
    public static final SmsStatus NotDeliveredBlockPanel = new SmsStatus(_NotDeliveredBlockPanel);
    public static final SmsStatus NotDeliveredUnknownNumber = new SmsStatus(_NotDeliveredUnknownNumber);
    public static final SmsStatus WaitingForDeliveryBeforeSend = new SmsStatus(_WaitingForDeliveryBeforeSend);
    public static final SmsStatus NotDeliveredUnAccessible = new SmsStatus(_NotDeliveredUnAccessible);
    public static final SmsStatus NotDeliveredNotAnswered = new SmsStatus(_NotDeliveredNotAnswered);
    public static final SmsStatus NotDeliveredLineIsBusy = new SmsStatus(_NotDeliveredLineIsBusy);
    public java.lang.String getValue() { return _value_;}
    public static SmsStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SmsStatus enumeration = (SmsStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SmsStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SmsStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SmsStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

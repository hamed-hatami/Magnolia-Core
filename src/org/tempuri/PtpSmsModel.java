/**
 * PtpSmsModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PtpSmsModel  implements java.io.Serializable {
    private java.lang.String senderNumber;

    private java.lang.String[] numbers;

    private java.util.Calendar sendOn;

    private org.tempuri.OperatorSmsSendType sendType;

    private long[] yourMessageId;

    private java.lang.String[] message;

    public PtpSmsModel() {
    }

    public PtpSmsModel(
           java.lang.String senderNumber,
           java.lang.String[] numbers,
           java.util.Calendar sendOn,
           org.tempuri.OperatorSmsSendType sendType,
           long[] yourMessageId,
           java.lang.String[] message) {
           this.senderNumber = senderNumber;
           this.numbers = numbers;
           this.sendOn = sendOn;
           this.sendType = sendType;
           this.yourMessageId = yourMessageId;
           this.message = message;
    }


    /**
     * Gets the senderNumber value for this PtpSmsModel.
     * 
     * @return senderNumber
     */
    public java.lang.String getSenderNumber() {
        return senderNumber;
    }


    /**
     * Sets the senderNumber value for this PtpSmsModel.
     * 
     * @param senderNumber
     */
    public void setSenderNumber(java.lang.String senderNumber) {
        this.senderNumber = senderNumber;
    }


    /**
     * Gets the numbers value for this PtpSmsModel.
     * 
     * @return numbers
     */
    public java.lang.String[] getNumbers() {
        return numbers;
    }


    /**
     * Sets the numbers value for this PtpSmsModel.
     * 
     * @param numbers
     */
    public void setNumbers(java.lang.String[] numbers) {
        this.numbers = numbers;
    }


    /**
     * Gets the sendOn value for this PtpSmsModel.
     * 
     * @return sendOn
     */
    public java.util.Calendar getSendOn() {
        return sendOn;
    }


    /**
     * Sets the sendOn value for this PtpSmsModel.
     * 
     * @param sendOn
     */
    public void setSendOn(java.util.Calendar sendOn) {
        this.sendOn = sendOn;
    }


    /**
     * Gets the sendType value for this PtpSmsModel.
     * 
     * @return sendType
     */
    public org.tempuri.OperatorSmsSendType getSendType() {
        return sendType;
    }


    /**
     * Sets the sendType value for this PtpSmsModel.
     * 
     * @param sendType
     */
    public void setSendType(org.tempuri.OperatorSmsSendType sendType) {
        this.sendType = sendType;
    }


    /**
     * Gets the yourMessageId value for this PtpSmsModel.
     * 
     * @return yourMessageId
     */
    public long[] getYourMessageId() {
        return yourMessageId;
    }


    /**
     * Sets the yourMessageId value for this PtpSmsModel.
     * 
     * @param yourMessageId
     */
    public void setYourMessageId(long[] yourMessageId) {
        this.yourMessageId = yourMessageId;
    }


    /**
     * Gets the message value for this PtpSmsModel.
     * 
     * @return message
     */
    public java.lang.String[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this PtpSmsModel.
     * 
     * @param message
     */
    public void setMessage(java.lang.String[] message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PtpSmsModel)) return false;
        PtpSmsModel other = (PtpSmsModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.senderNumber==null && other.getSenderNumber()==null) || 
             (this.senderNumber!=null &&
              this.senderNumber.equals(other.getSenderNumber()))) &&
            ((this.numbers==null && other.getNumbers()==null) || 
             (this.numbers!=null &&
              java.util.Arrays.equals(this.numbers, other.getNumbers()))) &&
            ((this.sendOn==null && other.getSendOn()==null) || 
             (this.sendOn!=null &&
              this.sendOn.equals(other.getSendOn()))) &&
            ((this.sendType==null && other.getSendType()==null) || 
             (this.sendType!=null &&
              this.sendType.equals(other.getSendType()))) &&
            ((this.yourMessageId==null && other.getYourMessageId()==null) || 
             (this.yourMessageId!=null &&
              java.util.Arrays.equals(this.yourMessageId, other.getYourMessageId()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSenderNumber() != null) {
            _hashCode += getSenderNumber().hashCode();
        }
        if (getNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSendOn() != null) {
            _hashCode += getSendOn().hashCode();
        }
        if (getSendType() != null) {
            _hashCode += getSendType().hashCode();
        }
        if (getYourMessageId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getYourMessageId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getYourMessageId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PtpSmsModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PtpSmsModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Numbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SendOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SendType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "OperatorSmsSendType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yourMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YourMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

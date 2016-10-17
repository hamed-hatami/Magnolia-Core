/**
 * GetReceiveSmsModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetReceiveSmsModel  implements java.io.Serializable {
    private java.lang.String message;

    private long senderNumber;

    private java.lang.String receiveNumber;

    private int id;

    private java.util.Calendar receiveDate;

    private boolean isRelayed;

    public GetReceiveSmsModel() {
    }

    public GetReceiveSmsModel(
           java.lang.String message,
           long senderNumber,
           java.lang.String receiveNumber,
           int id,
           java.util.Calendar receiveDate,
           boolean isRelayed) {
           this.message = message;
           this.senderNumber = senderNumber;
           this.receiveNumber = receiveNumber;
           this.id = id;
           this.receiveDate = receiveDate;
           this.isRelayed = isRelayed;
    }


    /**
     * Gets the message value for this GetReceiveSmsModel.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetReceiveSmsModel.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the senderNumber value for this GetReceiveSmsModel.
     * 
     * @return senderNumber
     */
    public long getSenderNumber() {
        return senderNumber;
    }


    /**
     * Sets the senderNumber value for this GetReceiveSmsModel.
     * 
     * @param senderNumber
     */
    public void setSenderNumber(long senderNumber) {
        this.senderNumber = senderNumber;
    }


    /**
     * Gets the receiveNumber value for this GetReceiveSmsModel.
     * 
     * @return receiveNumber
     */
    public java.lang.String getReceiveNumber() {
        return receiveNumber;
    }


    /**
     * Sets the receiveNumber value for this GetReceiveSmsModel.
     * 
     * @param receiveNumber
     */
    public void setReceiveNumber(java.lang.String receiveNumber) {
        this.receiveNumber = receiveNumber;
    }


    /**
     * Gets the id value for this GetReceiveSmsModel.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this GetReceiveSmsModel.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the receiveDate value for this GetReceiveSmsModel.
     * 
     * @return receiveDate
     */
    public java.util.Calendar getReceiveDate() {
        return receiveDate;
    }


    /**
     * Sets the receiveDate value for this GetReceiveSmsModel.
     * 
     * @param receiveDate
     */
    public void setReceiveDate(java.util.Calendar receiveDate) {
        this.receiveDate = receiveDate;
    }


    /**
     * Gets the isRelayed value for this GetReceiveSmsModel.
     * 
     * @return isRelayed
     */
    public boolean isIsRelayed() {
        return isRelayed;
    }


    /**
     * Sets the isRelayed value for this GetReceiveSmsModel.
     * 
     * @param isRelayed
     */
    public void setIsRelayed(boolean isRelayed) {
        this.isRelayed = isRelayed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetReceiveSmsModel)) return false;
        GetReceiveSmsModel other = (GetReceiveSmsModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            this.senderNumber == other.getSenderNumber() &&
            ((this.receiveNumber==null && other.getReceiveNumber()==null) || 
             (this.receiveNumber!=null &&
              this.receiveNumber.equals(other.getReceiveNumber()))) &&
            this.id == other.getId() &&
            ((this.receiveDate==null && other.getReceiveDate()==null) || 
             (this.receiveDate!=null &&
              this.receiveDate.equals(other.getReceiveDate()))) &&
            this.isRelayed == other.isIsRelayed();
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        _hashCode += new Long(getSenderNumber()).hashCode();
        if (getReceiveNumber() != null) {
            _hashCode += getReceiveNumber().hashCode();
        }
        _hashCode += getId();
        if (getReceiveDate() != null) {
            _hashCode += getReceiveDate().hashCode();
        }
        _hashCode += (isIsRelayed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetReceiveSmsModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "GetReceiveSmsModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiveNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReceiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRelayed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsRelayed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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

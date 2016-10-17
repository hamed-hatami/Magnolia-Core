/**
 * GetSmsDeliveryWithClientIdModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSmsDeliveryWithClientIdModel  implements java.io.Serializable {
    private org.tempuri.SmsStatus smsStatus;

    private long niksmsId;

    public GetSmsDeliveryWithClientIdModel() {
    }

    public GetSmsDeliveryWithClientIdModel(
           org.tempuri.SmsStatus smsStatus,
           long niksmsId) {
           this.smsStatus = smsStatus;
           this.niksmsId = niksmsId;
    }


    /**
     * Gets the smsStatus value for this GetSmsDeliveryWithClientIdModel.
     * 
     * @return smsStatus
     */
    public org.tempuri.SmsStatus getSmsStatus() {
        return smsStatus;
    }


    /**
     * Sets the smsStatus value for this GetSmsDeliveryWithClientIdModel.
     * 
     * @param smsStatus
     */
    public void setSmsStatus(org.tempuri.SmsStatus smsStatus) {
        this.smsStatus = smsStatus;
    }


    /**
     * Gets the niksmsId value for this GetSmsDeliveryWithClientIdModel.
     * 
     * @return niksmsId
     */
    public long getNiksmsId() {
        return niksmsId;
    }


    /**
     * Sets the niksmsId value for this GetSmsDeliveryWithClientIdModel.
     * 
     * @param niksmsId
     */
    public void setNiksmsId(long niksmsId) {
        this.niksmsId = niksmsId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSmsDeliveryWithClientIdModel)) return false;
        GetSmsDeliveryWithClientIdModel other = (GetSmsDeliveryWithClientIdModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.smsStatus==null && other.getSmsStatus()==null) || 
             (this.smsStatus!=null &&
              this.smsStatus.equals(other.getSmsStatus()))) &&
            this.niksmsId == other.getNiksmsId();
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
        if (getSmsStatus() != null) {
            _hashCode += getSmsStatus().hashCode();
        }
        _hashCode += new Long(getNiksmsId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSmsDeliveryWithClientIdModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "GetSmsDeliveryWithClientIdModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SmsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SmsStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("niksmsId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NiksmsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

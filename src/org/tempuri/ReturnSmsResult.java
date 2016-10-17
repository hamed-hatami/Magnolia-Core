/**
 * ReturnSmsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReturnSmsResult  implements java.io.Serializable {
    private org.tempuri.SmsReturn status;

    private java.lang.String id;

    private java.lang.String warningMessage;

    private long[] nikIds;

    public ReturnSmsResult() {
    }

    public ReturnSmsResult(
           org.tempuri.SmsReturn status,
           java.lang.String id,
           java.lang.String warningMessage,
           long[] nikIds) {
           this.status = status;
           this.id = id;
           this.warningMessage = warningMessage;
           this.nikIds = nikIds;
    }


    /**
     * Gets the status value for this ReturnSmsResult.
     * 
     * @return status
     */
    public org.tempuri.SmsReturn getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ReturnSmsResult.
     * 
     * @param status
     */
    public void setStatus(org.tempuri.SmsReturn status) {
        this.status = status;
    }


    /**
     * Gets the id value for this ReturnSmsResult.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ReturnSmsResult.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the warningMessage value for this ReturnSmsResult.
     * 
     * @return warningMessage
     */
    public java.lang.String getWarningMessage() {
        return warningMessage;
    }


    /**
     * Sets the warningMessage value for this ReturnSmsResult.
     * 
     * @param warningMessage
     */
    public void setWarningMessage(java.lang.String warningMessage) {
        this.warningMessage = warningMessage;
    }


    /**
     * Gets the nikIds value for this ReturnSmsResult.
     * 
     * @return nikIds
     */
    public long[] getNikIds() {
        return nikIds;
    }


    /**
     * Sets the nikIds value for this ReturnSmsResult.
     * 
     * @param nikIds
     */
    public void setNikIds(long[] nikIds) {
        this.nikIds = nikIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnSmsResult)) return false;
        ReturnSmsResult other = (ReturnSmsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.warningMessage==null && other.getWarningMessage()==null) || 
             (this.warningMessage!=null &&
              this.warningMessage.equals(other.getWarningMessage()))) &&
            ((this.nikIds==null && other.getNikIds()==null) || 
             (this.nikIds!=null &&
              java.util.Arrays.equals(this.nikIds, other.getNikIds())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getWarningMessage() != null) {
            _hashCode += getWarningMessage().hashCode();
        }
        if (getNikIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNikIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNikIds(), i);
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
        new org.apache.axis.description.TypeDesc(ReturnSmsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnSmsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SmsReturn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warningMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "WarningMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nikIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NikIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "long"));
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

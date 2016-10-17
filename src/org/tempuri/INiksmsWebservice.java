/**
 * INiksmsWebservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface INiksmsWebservice extends java.rmi.Remote {
    public org.tempuri.ReturnSmsResult groupSms(org.tempuri.AuthenticationModel security, org.tempuri.GroupSmsModel model) throws java.rmi.RemoteException;
    public org.tempuri.ReturnSmsResult ptpSms(org.tempuri.AuthenticationModel security, org.tempuri.PtpSmsModel model) throws java.rmi.RemoteException;
    public int getCredit(org.tempuri.AuthenticationModel security) throws java.rmi.RemoteException;
    public int getDiscountCredit(org.tempuri.AuthenticationModel security) throws java.rmi.RemoteException;
    public java.util.Calendar getPanelExpireDate(org.tempuri.AuthenticationModel security) throws java.rmi.RemoteException;
    public org.tempuri.GetReceiveSmsModel[] getReceiveSms(org.tempuri.AuthenticationModel security, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public boolean resetReceiveSmsVisitedStatus(org.tempuri.AuthenticationModel security, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
    public org.tempuri.SmsStatus[] getSmsDelivery(org.tempuri.AuthenticationModel security, long[] nikIds) throws java.rmi.RemoteException;
    public org.tempuri.GetSmsDeliveryWithClientIdModel getSmsDeliveryWithClientId(org.tempuri.AuthenticationModel security, long yourId) throws java.rmi.RemoteException;
    public java.lang.String getServertime(org.tempuri.AuthenticationModel security) throws java.rmi.RemoteException;
    public java.lang.String[] getSenderNumbers(org.tempuri.AuthenticationModel security) throws java.rmi.RemoteException;
}

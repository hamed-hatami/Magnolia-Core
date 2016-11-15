package ir.magnolia.core.util;


import org.joda.time.DateTime;
import org.tempuri.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.*;


public class WebServiceClientUtil {

    public static XMLGregorianCalendar convertStringToXmlGregorian(String dateString, DateFormat dateFormat) {
        try {
            Date date = dateFormat.parse(dateString);
            GregorianCalendar gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
            gregorianCalendar.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (Exception e) {
            return null;
        }

    }

    private int gen() {
        Random r = new Random(System.currentTimeMillis());
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }

    public String sendCode(String phoneNumber) {
        try {
            NiksmsWebserviceLocator locator = new NiksmsWebserviceLocator();
            INiksmsWebservice service = locator.getBasicHttpBinding_INiksmsWebservice();
            String[] destinationNumbers = {phoneNumber};
            long[] messageId = new long[]{gen()};
            String[] messages = {String.valueOf(gen())};
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd-hh:mm");
            dateFormat.setTimeZone(TimeZone.getTimeZone(Configuration.getProperty("timezone")));
            String formattedDate = dateFormat.format(new Date());
            ReturnSmsResult result = service.ptpSms(new AuthenticationModel(Configuration.getProperty("sms_username"), Configuration.getProperty("sms_password")), new PtpSmsModel("9830006179", destinationNumbers, convertStringToXmlGregorian(formattedDate, dateFormat).toGregorianCalendar(), OperatorSmsSendType.Normal, messageId, messages));
            if (result.getStatus().getValue().equalsIgnoreCase("Successful")) {
                return messages[0];
            } else {
                return "0";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        }
    }

    public String sendMessage(String phoneNumber, String message) {
        try {
            NiksmsWebserviceLocator locator = new NiksmsWebserviceLocator();
            INiksmsWebservice service = locator.getBasicHttpBinding_INiksmsWebservice();
            String[] destinationNumbers = {phoneNumber};
            long[] messageId = new long[]{256};
            String[] messages = {message};
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd-hh:mm");
            dateFormat.setTimeZone(TimeZone.getTimeZone(Configuration.getProperty("timezone")));
            String formattedDate = dateFormat.format(new Date());
            ReturnSmsResult result = service.ptpSms(new AuthenticationModel(Configuration.getProperty("sms_username"), Configuration.getProperty("sms_password")), new PtpSmsModel("9830006179", destinationNumbers, convertStringToXmlGregorian(formattedDate, dateFormat).toGregorianCalendar(), OperatorSmsSendType.Normal, messageId, messages));
            if (result.getStatus().getValue().equalsIgnoreCase("Successful")) {
                return messages[0];
            } else {
                return "0";
            }
        } catch (Exception e) {
            return "0";
        }
    }

}


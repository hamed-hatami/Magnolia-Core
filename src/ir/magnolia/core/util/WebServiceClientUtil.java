package ir.magnolia.core.util;


import org.tempuri.*;

import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;


public class WebServiceClientUtil {

    public static void main(String[] args) throws Exception {
        System.out.println(new WebServiceClientUtil().sendCode("09308419839"));
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

            Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
            long gmtTime = localCalendar.getTime().getTime();
            long timezoneAlteredTime = gmtTime + TimeZone.getTimeZone(Configuration.getProperty("timezone")).getRawOffset();
            Calendar tehranCalendar = Calendar.getInstance(TimeZone.getTimeZone(Configuration.getProperty("timezone")));
            tehranCalendar.setTimeInMillis(timezoneAlteredTime);

            ReturnSmsResult result = service.ptpSms(new AuthenticationModel(Configuration.getProperty("sms_username"), Configuration.getProperty("sms_password")), new PtpSmsModel("9830006179", destinationNumbers, tehranCalendar, OperatorSmsSendType.Normal, messageId, messages));
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
            Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
            long gmtTime = localCalendar.getTime().getTime();
            long timezoneAlteredTime = gmtTime + TimeZone.getTimeZone(Configuration.getProperty("timezone")).getRawOffset();
            Calendar tehranCalendar = Calendar.getInstance(TimeZone.getTimeZone(Configuration.getProperty("timezone")));
            tehranCalendar.setTimeInMillis(timezoneAlteredTime);
            ReturnSmsResult result = service.ptpSms(new AuthenticationModel(Configuration.getProperty("sms_username"), Configuration.getProperty("sms_password")), new PtpSmsModel("9830006179", destinationNumbers, tehranCalendar, OperatorSmsSendType.Normal, messageId, messages));
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


package ir.magnolia.core.util;


import org.tempuri.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class WebServiceClientUtil {

    public static void main(String[] args) {
        System.out.println(new WebServiceClientUtil().sendCode("09124472787"));
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
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd-hh:mm");
            calendar.setTime(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
            ReturnSmsResult result = service.ptpSms(new AuthenticationModel(Configuration.getProperty("sms_username"), Configuration.getProperty("sms_password")), new PtpSmsModel("9830006179", destinationNumbers, calendar, OperatorSmsSendType.Normal, messageId, messages));
            if (result.getStatus().getValue().equalsIgnoreCase("Successful")) {
                return messages[0];
            } else {
                return "0";
            }
        } catch (Exception e) {
            return "0";
        }
    }

    public String sendMessage(String phoneNumber, String message) {
        try {
            NiksmsWebserviceLocator locator = new NiksmsWebserviceLocator();
            INiksmsWebservice service = locator.getBasicHttpBinding_INiksmsWebservice();
            String[] destinationNumbers = {phoneNumber};
            long[] messageId = new long[]{256};
            String[] messages = {message};
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd-hh:mm");
            calendar.setTime(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
            ReturnSmsResult result = service.ptpSms(new AuthenticationModel(Configuration.getProperty("sms_username"), Configuration.getProperty("sms_password")), new PtpSmsModel("9830006179", destinationNumbers, calendar, OperatorSmsSendType.Normal, messageId, messages));
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


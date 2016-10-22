package ir.magnolia.core.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ir.magnolia.core.model.objectValue.TicketOrder;

import java.util.List;

public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String object2Json(Object reserve) throws Exception {
        return objectMapper.writeValueAsString(reserve);
    }

    public static List<TicketOrder> findInJson(String json) throws Exception {
        return objectMapper.readValue(json, new TypeReference<List<TicketOrder>>() {
        });
    }
}

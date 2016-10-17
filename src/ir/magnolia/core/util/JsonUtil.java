package ir.magnolia.core.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import ir.magnolia.core.model.entity.*;

import java.util.Arrays;

public class JsonUtil<T> {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String object2Json(Object reserve) throws Exception {
        return objectMapper.writeValueAsString(reserve);
    }

}

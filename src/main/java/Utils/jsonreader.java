package Utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class jsonreader {
    public static Map<String, Object> getData(String filePath) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(filePath), Map.class);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read JSON data from " + filePath, e);
        }
    }
}

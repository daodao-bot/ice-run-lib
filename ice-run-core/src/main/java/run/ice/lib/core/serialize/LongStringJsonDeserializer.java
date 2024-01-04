package run.ice.lib.core.serialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * 将 String 类型字符串转为 Long 类型数字，避免 js 丢失精度
 *
 * @author DaoDao
 */
public class LongStringJsonDeserializer extends JsonDeserializer<Long> {

    @Override
    public Long deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String value = p.getText();
        return (value == null || value.isEmpty()) ? null : Long.parseLong(value);
    }

}

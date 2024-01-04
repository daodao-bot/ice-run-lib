package run.ice.lib.core.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * Long 类型数字转为 String 类型字符串，避免 js 丢失精度
 *
 * @author DaoDao
 */
public class LongStringJsonSerializer extends JsonSerializer<Long> {

    @Override
    public void serialize(Long value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        String s = (value == null ? null : String.valueOf(value));
        if (s != null) {
            gen.writeString(s);
        }
    }

}

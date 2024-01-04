package run.ice.lib.core.serialize;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

@Slf4j
class SerializerTest {

    @Test
    void toJson() {
        Demo demo = new Demo();
        demo.setId(Long.MAX_VALUE);
        demo.setWord("demo");
        demo.setTime(LocalDateTime.now());
        System.out.println(demo.toJson());
        Assertions.assertTrue(true);
    }

    @Data
    private static class Demo implements Serializer {

        @JsonSerialize(using = LongStringJsonSerializer.class)
        @JsonDeserialize(using = LongStringJsonDeserializer.class)
        private Long id;

        private String word;

        private LocalDateTime time;

    }

}
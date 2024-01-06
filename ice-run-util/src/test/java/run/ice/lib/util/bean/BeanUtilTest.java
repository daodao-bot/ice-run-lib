package run.ice.lib.util.bean;

import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BeanUtilTest {

    @Test
    void nullProperties() {
        Demo demo = new Demo();
        demo.setA("a");
        demo.setB("b");
        demo.setC("c");
        String[] nullProperties = BeanUtil.nullProperties(demo);
        Assertions.assertEquals(0, nullProperties.length);

        demo = new Demo();
        demo.setA(null);
        demo.setB(null);
        demo.setC(null);
        nullProperties = BeanUtil.nullProperties(demo);
        Assertions.assertEquals(3, nullProperties.length);
        Assertions.assertEquals("a", nullProperties[0]);
        Assertions.assertEquals("b", nullProperties[1]);
        Assertions.assertEquals("c", nullProperties[2]);

        demo = new Demo();
        demo.setA("a");
        demo.setB(null);
        demo.setC("c");
        nullProperties = BeanUtil.nullProperties(demo);
        Assertions.assertEquals(1, nullProperties.length);
        Assertions.assertEquals("b", nullProperties[0]);
    }

    @Data
    private static class Demo {
        private String a;
        private String b;
        private String c;
    }

}
package run.ice.lib.util.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author DaoDao
 */
class RadixUtilTest {

    @Test
    void convert() {

        String source;
        String target;

        source = "7";
        target = RadixUtil.convert(source, 10, 2);
        Assertions.assertEquals("111", target);

        source = "FFF";
        target = RadixUtil.convert(source, 16, 2);
        Assertions.assertEquals("111111111111", target);

        source = "202401010000000000";
        target = RadixUtil.convert(source, 10, 62);
        Assertions.assertEquals("EwzvHbCZai", target);

    }

}
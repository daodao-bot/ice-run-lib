package run.ice.lib.core.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OkTest {

    @Test
    void test() {
        Ok ok = new Ok();
        Assertions.assertEquals("{}", ok.toJson());
    }

}
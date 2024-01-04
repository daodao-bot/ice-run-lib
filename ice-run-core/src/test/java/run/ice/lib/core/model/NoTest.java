package run.ice.lib.core.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NoTest {

    @Test
    void test() {
        No no = new No();
        Assertions.assertEquals("{}", no.toJson());
    }

}
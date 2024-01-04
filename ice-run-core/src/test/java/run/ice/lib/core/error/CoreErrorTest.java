package run.ice.lib.core.error;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoreErrorTest {

    @Test
    void codeMessage() {
        CoreError nextError = CoreError.ERROR;
        Assertions.assertEquals("999999", nextError.code);
        Assertions.assertEquals("ERROR", nextError.message);
    }

}
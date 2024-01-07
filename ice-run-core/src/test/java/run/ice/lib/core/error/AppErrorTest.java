package run.ice.lib.core.error;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppErrorTest {

    @Test
    void codeMessage() {
        AppError nextError = AppError.ERROR;
        Assertions.assertEquals("999999", nextError.code);
        Assertions.assertEquals("ERROR", nextError.message);
    }

}
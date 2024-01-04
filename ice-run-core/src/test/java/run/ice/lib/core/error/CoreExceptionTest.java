package run.ice.lib.core.error;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class CoreExceptionTest {

    @Test
    void test() {
        CoreException e = new CoreException();
        log.error(e.getMessage(), e);

        e = new CoreException("错误");
        log.error(e.getMessage(), e);

        e = new CoreException("999999", "异常");
        log.error(e.getMessage(), e);

        e = new CoreException(new Exception("异常"));
        log.error(e.getMessage(), e);

        e = new CoreException("错误", new Exception("异常"));
        log.error(e.getMessage(), e);

        e = new CoreException("999999", "错误", new Exception("异常"));
        log.error(e.getMessage(), e);

        e = new CoreException(CoreError.ERROR);
        log.error(e.getMessage(), e);

        e = new CoreException(CoreError.ERROR, "错误");
        log.error(e.getMessage(), e);

        e = new CoreException(CoreError.ERROR, new Exception("异常"));
        log.error(e.getMessage(), e);

        e = new CoreException(CoreError.ERROR, "错误", new Exception("异常"));
        log.error(e.getMessage(), e);
    }

}
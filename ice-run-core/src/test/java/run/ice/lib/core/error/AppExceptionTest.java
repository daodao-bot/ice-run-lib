package run.ice.lib.core.error;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class AppExceptionTest {

    @Test
    void test() {
        AppException e = new AppException();
        log.error(e.getMessage(), e);

        e = new AppException("错误");
        log.error(e.getMessage(), e);

        e = new AppException("999999", "异常");
        log.error(e.getMessage(), e);

        e = new AppException(new Exception("异常"));
        log.error(e.getMessage(), e);

        e = new AppException("错误", new Exception("异常"));
        log.error(e.getMessage(), e);

        e = new AppException("999999", "错误", new Exception("异常"));
        log.error(e.getMessage(), e);

        e = new AppException(AppError.ERROR);
        log.error(e.getMessage(), e);

        e = new AppException(AppError.ERROR, "错误");
        log.error(e.getMessage(), e);

        e = new AppException(AppError.ERROR, new Exception("异常"));
        log.error(e.getMessage(), e);

        e = new AppException(AppError.ERROR, "错误", new Exception("异常"));
        log.error(e.getMessage(), e);
    }

}
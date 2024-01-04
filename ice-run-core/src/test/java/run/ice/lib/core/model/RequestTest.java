package run.ice.lib.core.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class RequestTest {

    @Test
    void test() {
        Request<No> request = new Request<>();
        log.info("{}", request.toJson());

        request = new Request<>(new No());
        log.info("{}", request.toJson());

        request = Request.no();
        log.info("{}", request.toJson());
    }

}
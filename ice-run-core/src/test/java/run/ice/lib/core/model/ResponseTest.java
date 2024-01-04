package run.ice.lib.core.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import run.ice.lib.core.error.CoreError;
import run.ice.lib.core.error.CoreException;

@Slf4j
class ResponseTest {

    @Test
    void test() {
        Response<Ok> response = new Response<>();
        log.info("{}", response.toJson());

        response = new Response<>(new Ok());
        log.info("{}", response.toJson());

        response = new Response<>("000000", "OK");
        log.info("{}", response.toJson());

        response = new Response<>("000000", "OK", new Ok());
        log.info("{}", response.toJson());

        response = Response.ok();
        log.info("{}", response.toJson());

        response = new Response<>(CoreError.ERROR);
        log.info("{}", response.toJson());

        response = new Response<>(new CoreException(CoreError.ERROR));
        log.info("{}", response.toJson());
    }

}
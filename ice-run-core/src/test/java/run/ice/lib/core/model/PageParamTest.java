package run.ice.lib.core.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class PageParamTest {

    @Test
    void test() {
        PageParam<No> pageParam = new PageParam<>();
        log.info("{}", pageParam.toJson());

        pageParam = new PageParam<>(1, 10, new No());
        log.info("{}", pageParam.toJson());

        pageParam = new PageParam<>(new No());
        log.info("{}", pageParam.toJson());
    }

}
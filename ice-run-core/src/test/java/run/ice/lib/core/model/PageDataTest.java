package run.ice.lib.core.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
class PageDataTest {

    @Test
    void test() {
        PageData<Ok> pageData = new PageData<>();
        log.info("{}", pageData.toJson());

        pageData = new PageData<>(1, 10, 100L, List.of(new Ok()));
        log.info("{}", pageData.toJson());
    }

}
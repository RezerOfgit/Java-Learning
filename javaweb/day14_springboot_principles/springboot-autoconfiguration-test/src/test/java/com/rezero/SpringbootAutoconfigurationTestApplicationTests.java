package com.rezero;

import com.rezeroalter.AlertService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootAutoconfigurationTestApplicationTests {

    @Autowired
    private AlertService alertService;

    @Test
    public void testSendAlert() {
        alertService.send("数据库 CPU 超过 90%!");
    }

}

package com.sayid.testcase;

import com.sayid.demo.BaseTest;
import com.sayid.util.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestTwo extends BaseTest {

    private final static Logger logger = Utils.getLogger(TestTwo.class);

    @Test
    public void testTwo1() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + Thread.currentThread().getId() + ": test1 -> 3");
        }
    }

    @Test
    public void testTwo2() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + Thread.currentThread().getId() + ": test1 -> 4");
        }
    }
}

package com.sayid.testcase;

import com.sayid.demo.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestOne extends BaseTest {

    private Logger logger = LogManager.getLogger(this.getClass());

    @Test
    public void testOne1() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + Thread.currentThread().getId() + ": test1 -> 1");
        }
    }

    @Test
    public void testOne2() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + Thread.currentThread().getId() + ": test1 -> 2");
        }
    }
}

package com.sayid.testcase;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.sayid.demo.BaseTest;
import com.sayid.util.Utils;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestTwo extends BaseTest {

    private Logger logger = Utils.getLogger(this.getClass());

    @BeforeClass
    public void setupBeforeClass() {
        logger.info("Setup Before Class");
    }

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

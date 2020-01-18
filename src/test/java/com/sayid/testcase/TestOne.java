package com.sayid.testcase;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.sayid.demo.BaseTest;
import com.sayid.util.Utils;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestOne extends BaseTest {
    private Logger logger;
    //Logger logger1 = Utils.getLogger(this.getClass());

    @BeforeClass
    public void setupBeforeClass() {
        logger = Utils.getLogger(this.getClass());
    }

    @Test
    public void testOne1() throws InterruptedException {
        //Logger logger = Utils.getLogger(this.getClass());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            logger.debug("Sayid");
            logger.info(Thread.currentThread().getName() + Thread.currentThread().getId() + ": test1 -> 1");
        }
    }

    @Test
    public void testOne2() throws InterruptedException {
        //Logger logger = Utils.getLogger(this.getClass());
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            logger.info(Thread.currentThread().getName() + Thread.currentThread().getId() + ": test1 -> 2");
        }
    }
}

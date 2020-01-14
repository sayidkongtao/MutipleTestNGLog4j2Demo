package com.sayid.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private Logger logger = LogManager.getLogger(this.getClass());

    @BeforeSuite
    public void setup(){
        ThreadContext.put("threadName", Thread.currentThread().getName());
        logger.info(Thread.currentThread().getName() + Thread.currentThread().getId() + ": setup -> BeforeSuite");
    }
}

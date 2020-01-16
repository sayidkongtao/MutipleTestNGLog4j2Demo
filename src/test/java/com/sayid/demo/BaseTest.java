package com.sayid.demo;

import com.sayid.util.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private Logger logger = Utils.getLogger(this.getClass());

    @BeforeSuite
    public void setup(){
        logger.info(Thread.currentThread().getName() + Thread.currentThread().getId() + ": setup -> BeforeSuite");
    }
}

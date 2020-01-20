package com.sayid.demo;

import com.sayid.listener.CustomListener;
import com.sayid.util.Utils;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({CustomListener.class})
public class BaseTest {

    private Logger logger;

    static {
        System.setProperty("log4j2.contextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
    }

    @BeforeSuite
    public void setup(){
        logger = Utils.getLogger(this.getClass());
        logger.info(Thread.currentThread().getName() + Thread.currentThread().getId() + ": setup -> BeforeSuite");
    }
}

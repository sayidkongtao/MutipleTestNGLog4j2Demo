package com.sayid.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class Utils {

    public static Logger getLogger(final Class<?> clazz) {
        ThreadContext.put("threadName", Thread.currentThread().getName());
        ThreadContext.put("PID", Thread.currentThread().getId() + "");
        System.out.println(Thread.currentThread().getId());
        return LogManager.getLogger(clazz);
    }
}

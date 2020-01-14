package com.sayid.customlog;


import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.lookup.StrLookup;

@Plugin(name = "thread", category = StrLookup.CATEGORY)
public class ThreadLookup implements StrLookup {
    public String lookup(String key) {
        return Thread.currentThread().getName();
    }

    public String lookup(LogEvent event, String key) {
        return event.getThreadName() == null ? Thread.currentThread().getName() : event.getThreadName();
    }
}

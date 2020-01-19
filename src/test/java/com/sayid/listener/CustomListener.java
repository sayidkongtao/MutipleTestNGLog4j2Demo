package com.sayid.listener;

import com.sayid.util.Utils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter {

    private Logger logger = Utils.getLogger(this.getClass());;

    @Override
    public void beforeConfiguration(ITestResult tr) {
        super.beforeConfiguration(tr);
        ThreadContext.put("threadPID", Thread.currentThread().getId() + "");
    }

    @Override
    public void onTestStart(ITestResult tr) {
        super.onTestStart(tr);
        logger.info("[" + tr.getName() + " Start]");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        logger.info("[" + tr.getName() + " Failure]");
        logger.error(tr.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
        logger.info("[" + tr.getName() + " Skipped]");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        logger.info("[" + tr.getName() + " Success]");
    }

    @Override
    public void onFinish(ITestContext testContext) {
        super.onFinish(testContext);
    }
}

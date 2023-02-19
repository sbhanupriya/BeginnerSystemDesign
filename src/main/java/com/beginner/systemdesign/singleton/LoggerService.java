package com.beginner.systemdesign.singleton;

import org.apache.commons.logging.Log;

public class LoggerService {
    //mark constructor private
    private LoggerService(){}
    private static LoggerService loggerService;
    public static LoggerService getLoggerServiceInstance()
    {
        if(loggerService == null)
        {
            synchronized (LoggerService.class) {
                loggerService = new LoggerService();
            }
        }
        return loggerService;
    }
}

package com.beginner.systemdesign.singleton;

import org.apache.commons.logging.Log;

public class Singleton {
    public static void main(String[] args)
    {
        LoggerService service1 = LoggerService.getLoggerServiceInstance();
        System.out.println(service1);
        LoggerService service2 = LoggerService.getLoggerServiceInstance();
        System.out.println(service2);
    }
}

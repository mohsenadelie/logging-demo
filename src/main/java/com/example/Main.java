package com.example;

//------------------------------log4j-----------------------
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

//public class Main {
//    private final static Logger LOGGER = Logger.getLogger(Main.class);
//
//    public static void main(String[] args) {
//        //PropertiesConfigurator is used to configure logger from properties file
//        // if we use log4j.properties we don't need this line
//        PropertyConfigurator.configure("src/main/resources/loggo.properties");
//
//        int sum = 0;
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            sum += i;
//            LOGGER.info("i is: " + i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("Sum =" + sum);
//        System.out.println("Time is: " + (end - start));
//    }
//}
//------------------------------------------------------------


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Main m = new Main();
        m.myMethod();
    }

    private void myMethod() {
        int sum = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
            if (LOGGER.isDebugEnabled())
                LOGGER.debug("i is: " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Sum =" + sum);
        System.out.println("Time is: " + (end - start));
    }
}

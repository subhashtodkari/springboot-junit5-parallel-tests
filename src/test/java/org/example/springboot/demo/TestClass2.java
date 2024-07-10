package org.example.springboot.demo;

import org.example.springboot.demo.api.FlakyTest;

public class TestClass2 extends AbstractBaseTest {

    @FlakyTest
    public void method_2_1() {
        try {
            logger.info("Started method_2_2.........");
            long startTime = System.currentTimeMillis();
            while(System.currentTimeMillis() - startTime < 5000) {
                Thread.sleep(500);
                logger.info("method_2_1 in progress");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

            logger.info("Finished method_2_2---------");
        }
    }

    @FlakyTest
    public void method_2_2() {
        try {
            logger.info("Started method_2_2.........");
            long startTime = System.currentTimeMillis();
            while(System.currentTimeMillis() - startTime < 5000) {
                Thread.sleep(500);
                logger.info("method_2_2 in progress");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

            logger.info("Finished method_2_2---------");
        }
    }
}

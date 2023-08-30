package org.example.springboot.demo;

import org.junit.jupiter.api.Test;

public class TestClass1 extends AbstractBaseTest {

    @Test
    public void method_1_1() {
        try {
            logger.info("Started method_1_1.........");
            long startTime = System.currentTimeMillis();
            while(System.currentTimeMillis() - startTime < 5000) {
                Thread.sleep(500);
                logger.info("method_1_1 in progress");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

            logger.info("Finished method_1_1---------");
        }
    }

    @Test
    public void method_1_2() {
        try {
            logger.info("Started method_1_2.........");
            long startTime = System.currentTimeMillis();
            while(System.currentTimeMillis() - startTime < 5000) {
                Thread.sleep(500);
                logger.info("method_1_2 in progress");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

            logger.info("Finished method_1_2---------");
        }
    }
}

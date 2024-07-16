package org.example.springboot.demo;

import org.example.springboot.demo.api.FlakyTest;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlakyTests extends AbstractBaseTest {


    @FlakyTest(minSuccess = 3, repeats = 10)
    public void flakyTest01() {
        Random random = new Random();
        int r = random.nextInt(10);
        logger.info("r ==================== " + r);
        long startTime = System.currentTimeMillis();
        while(System.currentTimeMillis() - startTime < 500) {
            try { Thread.sleep(50); } catch (Exception e) {}
            logger.info("flakyTest01 in progress");
        }
        Assertions.assertTrue(r % 2 == 0, "r is not even, r = " + r);
    }
}

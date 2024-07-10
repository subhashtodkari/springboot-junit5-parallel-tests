package org.example.springboot.demo;

import io.github.artsok.RepeatedIfExceptionsTest;
import org.example.springboot.demo.api.FlakyTest;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

public class FlakyTests extends AbstractBaseTest {

    private static int i = 0;

    @FlakyTest
    public void flakyTest01() {
        i++;
        logger.info("i ==================== " + i);
        long startTime = System.currentTimeMillis();
        while(System.currentTimeMillis() - startTime < 5000) {
            try { Thread.sleep(500); } catch (Exception e) {}
            logger.info("flakyTest01 in progress");
        }
        if(i < 4) {
            throw new RuntimeException("number is less than 2: " + i + ", may be temporary issue, try again");
        }
    }
}

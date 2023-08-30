package org.example.springboot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AbstractBaseTest {

    protected final Logger logger = LoggerFactory.getLogger(getClass());


}

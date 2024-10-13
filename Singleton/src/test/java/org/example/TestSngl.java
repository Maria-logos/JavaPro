package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSngl {

    @Test
    public void testSingletone()
    {
        Logger logger1 = Logger.getInstance();
        logger1.log("First message in logs");

        Logger logger2 = Logger.getInstance();
        logger2.log ("Second message on logs");
        logger2.log ("Third message on logs");


        Assertions.assertEquals(logger2, logger1);
        Assertions.assertEquals(3, logger2.getMessageCnt());
    }
}

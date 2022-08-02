package step_definitions.api_stepDefs.lessonsTraining_stepDefs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogs {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(TestLogs.class);

        System.out.println("Some test execution started");

        System.out.println("going to dzone.com");
        logger.info("on dzon.com");
        System.out.println("Click on login button");
        logger.warn("login in to application");

    }





}

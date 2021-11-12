import org.apache.log4j.*;

public class Driver {
    public static void main(String[] args) {
        //LoggerConfig.configure();

        Test.test();

        Logger logger = Logger.getLogger(Driver.class);
        logger.trace("Printing a trace message");
        logger.debug("Printing a debug message");
        logger.info("Printing an info message");
        logger.warn("Printing a warn message");
        logger.error("Printing an error message");
        logger.fatal("Printing a fatal message");

        try{
            throw new RuntimeException("New runtime exception. Dunno what happened");
        } catch (RuntimeException e) {
            logger.warn(e.getMessage(), e);
        }
    }
}

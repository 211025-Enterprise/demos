import org.apache.log4j.*;

public class LoggerConfig {

    public static void configure(){
        ConsoleAppender cAppender = new ConsoleAppender();
        String pattern = "%p:%c:Line %L %d %m millis: %r %n";
        PatternLayout layout = new PatternLayout(pattern);
        cAppender.setLayout(layout);
        cAppender.activateOptions();
        cAppender.setThreshold(Level.INFO);
        Logger.getRootLogger().addAppender(cAppender);

        FileAppender fileAppender = new FileAppender();
        fileAppender.setFile("logs/log.out");
        fileAppender.setLayout(layout);
        fileAppender.setThreshold(Level.ERROR);
        fileAppender.activateOptions();
        Logger.getRootLogger().addAppender(fileAppender);
    }
}

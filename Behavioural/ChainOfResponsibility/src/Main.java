public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        LogHandler logger = new InfoLogHandler(new DebugHandler(new WarnHandler(new ErrorHandler(null))));
        logger.log(LogHandler.ERROR , "Error log");
        logger.log(LogHandler.INFO, "Info log");
        logger.log(LogHandler.WARN, "Warn log");
    }
}

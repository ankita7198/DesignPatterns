public abstract class LogHandler {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int WARN = 3;
    public static int ERROR = 4;

    LogHandler nextHandler;

    public LogHandler(LogHandler handler){
        nextHandler = handler;
    }

    public void log(int logLevel, String message){
        if(nextHandler != null){
            nextHandler.log(logLevel,message);
        }
    }
}



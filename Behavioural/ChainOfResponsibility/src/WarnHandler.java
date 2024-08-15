public class WarnHandler extends LogHandler {

    public WarnHandler(LogHandler handler){
        super(handler);
    }

    public void log(int logLevel, String message){
        if(logLevel == WARN){
            System.out.println("WARN : " + message);
        }
        else {
            super.log(logLevel,message);
        }
    }
}

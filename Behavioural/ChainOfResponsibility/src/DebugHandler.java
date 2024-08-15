public class DebugHandler extends LogHandler {

    public DebugHandler(LogHandler handler){
        super(handler);
    }

    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println("DEBUG : " + message);
        }
        else {
            super.log(logLevel,message);
        }
    }
}

public class ErrorHandler extends LogHandler {

    public ErrorHandler(LogHandler handler){
        super(handler);
    }

    public void log(int logLevel, String message){
        if(logLevel == ERROR){
            System.out.println("ERROR : " + message);
        }
        else {
            super.log(logLevel,message);
        }
    }
}

public class InfoLogHandler extends LogHandler {

    public InfoLogHandler(LogHandler handler){
        super(handler);
    }

    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println("INFO : " + message);
        }
        else {
            super.log(logLevel,message);
        }
    }
}

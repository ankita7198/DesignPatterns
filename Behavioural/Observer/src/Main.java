import WeatherStationObservable.TemperatureObservable;
import WeatherStationObservable.WsObservableInterface;
import WeatherStationObservers.MobileDisplayObserver;
import WeatherStationObservers.TvDisplayObserver;
import WeatherStationObservers.WsObserverInterface;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        WsObservableInterface tempObservable = new TemperatureObservable();
        WsObserverInterface tvTempObserver = new TvDisplayObserver(tempObservable);
        WsObserverInterface mobileTempObserver = new MobileDisplayObserver(tempObservable);
        tempObservable.addDisplayObservers(tvTempObserver);
        tempObservable.addDisplayObservers(mobileTempObserver);
        tempObservable.setTemperature(10.5f);
        tempObservable.setTemperature(90);
    }
}

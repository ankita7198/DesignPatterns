package WeatherStationObservers;

import WeatherStationObservable.WsObservableInterface;

public class TvDisplayObserver implements WsObserverInterface {
    WsObservableInterface tempObservable;

    public TvDisplayObserver(WsObservableInterface observable){
        this.tempObservable = observable;
    }

    @Override
    public void updateObserver() {
        float temperature = tempObservable.getTemp();
        System.out.println("Here comes the temperature - " + temperature);
    }
}

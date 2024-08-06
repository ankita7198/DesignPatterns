package WeatherStationObservers;

import WeatherStationObservable.WsObservableInterface;

public class MobileDisplayObserver implements WsObserverInterface {
    WsObservableInterface observable;

    public MobileDisplayObserver(WsObservableInterface observable){
        this.observable = observable;
    }

    @Override
    public void updateObserver() {
        float temperature = observable.getTemp();
        System.out.println("Here comes the temperature - " + temperature);
    }
}

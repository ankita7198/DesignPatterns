package WeatherStationObservable;

import WeatherStationObservers.WsObserverInterface;

import java.util.HashSet;

public class TemperatureObservable implements WsObservableInterface {
    HashSet<WsObserverInterface> displayObservers = new HashSet<>();
    float currTemp = 0;

    @Override
    public void addDisplayObservers(WsObserverInterface observer) {
        displayObservers.add(observer);
    }

    @Override
    public void removeDisplayObservers(WsObserverInterface observer) {
        displayObservers.remove(observer);
    }

    @Override
    public void notifyDisplayObservers() {
        for(WsObserverInterface observer : displayObservers){
            observer.updateObserver();
        }
    }

    @Override
    public void setTemperature(float temp) {
        this.currTemp = temp;
        if(temp > 10){
            notifyDisplayObservers();
        }
    }

    @Override
    public float getTemp() {
        return this.currTemp;
    }
}

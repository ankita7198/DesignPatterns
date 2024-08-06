package WeatherStationObservable;

import WeatherStationObservers.WsObserverInterface;

public interface WsObservableInterface {
    public void addDisplayObservers(WsObserverInterface observer);
    public void removeDisplayObservers(WsObserverInterface observer);
    public void notifyDisplayObservers();
    public void setTemperature(float temp);
    public float getTemp();
}

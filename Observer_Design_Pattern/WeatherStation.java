import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

    private List<Observer> observers;
    private int temparature;
    private int humidity;

    public WeatherStation(){
        this.observers = new ArrayList<>();
    }

    private boolean hasObserver(Observer observer){
        int index = observers.indexOf(observer);
        return index>=0;
    }

    @Override
    public void registerObserver(Observer observer) {
       if(!hasObserver(observer)){
          observers.add(observer);
       }    
    }

    @Override
    public void removeObserver(Observer observer) {
         if(hasObserver(observer)){
           observers.remove(observers.indexOf(observer));
         }
    }

    @Override
    public void notifyObservers() {
         observers.forEach(Observer->Observer.update(temparature, humidity));
    }

    public void parametersChanged(int temparature,int humidity){
        this.temparature = temparature;
        this.humidity = humidity;
        notifyObservers();
    }
    
}

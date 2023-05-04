public class CurWeatherDispaly implements Observer{

    private int temparature;
    private int humidity;

    public CurWeatherDispaly(Observable observable){
        observable.registerObserver(this);
    }

    @Override
    public void update(int temparature, int humidity) {
         this.temparature = temparature;
         this.humidity = humidity;
         display();
    }
    
    private void display(){
        System.out.println("Current Weather Condition : Temparature : "+temparature+" ,Humidity"+humidity);
    }
}

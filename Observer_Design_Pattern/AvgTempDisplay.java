

public class AvgTempDisplay implements Observer{

    private int sumOfTemparatures;
    private int totalTemparatures;

    public AvgTempDisplay(Observable observable){
        sumOfTemparatures = 0;
        totalTemparatures = 0;
        observable.registerObserver(this);
    }

    @Override
    public void update(int temparature, int humidity) {
          sumOfTemparatures += temparature;
          totalTemparatures++;
          display();
    }

    public void display(){
        System.out.println("Average Temparatur for the past "+totalTemparatures+" records , Avg is : "+(double)(sumOfTemparatures/totalTemparatures));
    }
    
}

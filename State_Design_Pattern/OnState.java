public class OnState implements State{

    @Override
    public void toggle(LightBulb lightBulb) {
       System.out.println("Turning off the light bulb.");
       lightBulb.setState(new OffState());
    }
    
}

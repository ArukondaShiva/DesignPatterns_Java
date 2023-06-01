public class OffState implements State{

    @Override
    public void toggle(LightBulb lightBulb) {
        System.out.println("Turning on the light bulb.");
        lightBulb.setState(new OnState());
    }
    
}

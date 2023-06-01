public class LightBulb{
    private State currentState;

    public LightBulb(){
        currentState = new OffState();
    }

    public void setState(State state){
        currentState = state;
    }

    public void toggle(){
        currentState.toggle(this);
    }
}
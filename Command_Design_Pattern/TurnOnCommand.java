public class TurnOnCommand implements Command{

    Light light;

    TurnOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
       light.turnOn();
    }
    
}

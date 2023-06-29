public class TurnOffCommand implements Command{

    private Light light;

    TurnOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
      light.turnOff();
    }
    
}

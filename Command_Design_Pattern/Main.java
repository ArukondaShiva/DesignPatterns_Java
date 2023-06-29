public class Main {
    public static void main(String[] args) {
        
        Light light = new Light();

        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        turnOffCommand.execute();
        turnOnCommand.execute();
        
    }
}

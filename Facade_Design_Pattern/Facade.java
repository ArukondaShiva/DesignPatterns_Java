// Facade
public class Facade {
    
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade(){
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
    }

    public void operation(){
        subsystemA.operatonA();
        subsystemB.oprationB();
    }

}

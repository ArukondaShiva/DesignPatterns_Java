 
public class ExtraCheeseBurger extends BurgerDecorator{

    private Burger burger;

    public ExtraCheeseBurger(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return this.burger.getDescription()+" with extra cheese ";    
    }

    @Override
    public double getCost() {
        return this.burger.getCost()+10.0;
    }
    
}
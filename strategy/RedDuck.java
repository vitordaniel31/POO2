

public class RedDuck extends Duck
{
    RedDuck() {
        setQuackBehavior(new MuteQuack());
        setVooBehavior(new NaturalQuack());
        setNadoBehavior(new ToyQuack());
    }
    
    public void display(){
        System.out.println("Red duck");
    }
}

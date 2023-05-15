

public class ToyQuack implements QuackBehavior, NadoBehavior
{
    public void quack(){
        System.out.println("squeak! squeak!");
    }
    
    public void voar(){
        System.out.println("Sou um pato de brinquedo que voa");
    }
    
    public void nadar(){
        System.out.println("Sou um pato de brinquedo que nada");
    }
}

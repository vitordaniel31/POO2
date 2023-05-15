

public class NaturalQuack implements QuackBehavior, VooBehavior, NadoBehavior
{
 
    public void quack(){
        System.out.println("quack! quack! quack!");
    }
    
    public void voar(){
        System.out.println("Sou um pato bonzinho da silva que voa");
    }
    
    public void nadar(){
        System.out.println("Sou um pato bonzinho da silva que nada");
    }
}

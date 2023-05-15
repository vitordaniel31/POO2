

public class MuteQuack implements QuackBehavior, VooBehavior
{
    public void quack(){
        System.out.println("mute");
    }
    
    public void voar(){
        System.out.println("Sou um pato mudo que voa");
    }
    
    public void nadar(){
        System.out.println("Sou um pato mudo que nada");
    }
    
    

}

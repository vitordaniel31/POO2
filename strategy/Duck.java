
/**
 * Classe abstrata Duck - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Duck
{
    protected QuackBehavior quackBehavior;
    protected VooBehavior vooBehavior;
    protected NadoBehavior nadoBehavior;
    
    public abstract void display();
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void setQuackBehavior(QuackBehavior q){
        quackBehavior = q;
    }
    
    public void performVoo(){
        vooBehavior.voar();
    }
    
    public void setVooBehavior(VooBehavior v){
        vooBehavior = v;
    }
    
    public void performNado(){
        nadoBehavior.nadar();
    }
    
    public void setNadoBehavior(NadoBehavior n){
        nadoBehavior = n;
    }
}

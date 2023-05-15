
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Teste
{
    private RedDuck redDuck;
    
    Teste () {
        redDuck = new RedDuck();
    }
    
    public void quack()
    {
        redDuck.performQuack();
    }
    
    public void voar()
    {
        redDuck.performVoo();
    }
    
    public void nadar()
    {
        redDuck.performNado();
    }
}


public class Peixe extends MenuComponent
{
    public Peixe(){        
    }
    
    public String getName(){
        return "Peixe";
    }
    
    public String getDescription(){
        return "Peixe Cozido";
    }
    
    public double getPrice(){
        return 60;
    }
        
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        
        System.out.print(", "+getPrice());
        System.out.print("     --  "+getDescription());
    }

}

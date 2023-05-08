
public class Sonho extends MenuComponent
{
    public Sonho(){        
    }
    
    public String getName(){
        return "Sonho";
    }
    
    public String getDescription(){
        return "Sonho";
    }
    
    public double getPrice(){
        return 1;
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

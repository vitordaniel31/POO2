
public class PaoDoce extends MenuComponent
{
    public PaoDoce(){        
    }
    
    public String getName(){
        return "PaoDoce";
    }
    
    public String getDescription(){
        return "PaoDoce";
    }
    
    public double getPrice(){
        return 2;
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

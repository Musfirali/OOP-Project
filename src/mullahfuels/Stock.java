
package mullahfuels;

 public abstract class Stock {
    private double PetrolTank;
    private double Diesel;
    private int Lubricant;
    
    public double getpetrolTank(){
        return PetrolTank;
    } 
    public double getDiesel(){
        return Diesel;
    } 
    public double getLubricant(){
        return Lubricant;
    } 
    public void setPetrolTank(double PetrolTank){
        this.PetrolTank = PetrolTank;
    }
    public void setDiesel(double Diesel){
        this.Diesel = Diesel;
    }
    public void setLubricant(int Lubricant){
        this.Lubricant = Lubricant;
    }

    public abstract double price();
    
    public abstract double qty();
//    public abstract int qty();
}

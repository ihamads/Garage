public class Truck extends Vehicle
{
    private double CargoCapacity;

    public Truck(String ownerName,String brand , String model ,int year , double CargoCapacity)
    {
        super(ownerName, brand, model, year);
        this.CargoCapacity=CargoCapacity;
    }

    public void SetCargoCapacity(double CargoCapacity)
    {
        this.CargoCapacity=CargoCapacity;
    }
    public double getCargoCapacity()
    {
        return CargoCapacity;
    }

    @Override 

    public void DisplayInfo()
    {
       System.out.println("Owner:"+getOwnerName());
       System.out.println("Brand:"+getBrand());
       System.out.println("Model:"+getModel());
       System.out.println("Year:"+getYear());
       System.out.println("CargoCapacity:"+getCargoCapacity());               
    }



}
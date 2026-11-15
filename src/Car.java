public class Car extends Vehicle
{
    private int SeatingCapacity;

    public Car(String ownerName,String brand , String model ,int year , int SeatingCapacity)
    {
        super(ownerName,brand,model,year);
        this.SeatingCapacity=SeatingCapacity;
    }
     public void SetSeatingCapacity(int SeatingCapacity)
        {
            this.SeatingCapacity=SeatingCapacity;
        }
     public int getSeatingCapcity()
     {
        return SeatingCapacity;
     }

    @Override
    public void DisplayInfo()
    {
       System.out.println("Owner:"+getOwnerName());
       System.out.println("Brand:"+getBrand());
       System.out.println("Model:"+getModel());
       System.out.println("Year:"+getYear());
       System.out.println("Seating Capacity:"+getSeatingCapcity());
               
    }
    

}

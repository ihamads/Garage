public class MotorCycle extends Vehicle
{
    private int EngineSize;

    public MotorCycle(String ownerName,String brand , String model ,int year,int EngineSize)
    {
        super(ownerName, brand, model, year);
        this.EngineSize=EngineSize;
    }
    public void setEngineSize(int EngineSize)
    {
        this.EngineSize=EngineSize;
    }
    public int getEngineSize()
    {
        return EngineSize;
    }
    @Override

    public void DisplayInfo()
    {
       System.out.println("Owner:"+getOwnerName());
       System.out.println("Brand:"+getBrand());
       System.out.println("Model:"+getModel());
       System.out.println("Year:"+getYear());
       System.out.println("Engine SIZE::"+getEngineSize()+"CC");               
    }



}
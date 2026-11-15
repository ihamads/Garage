public class Garage 
{
    private Vehicle[] Vehicles;
    private int count;

    public Garage()
    {
        this.Vehicles=new Vehicle[100];
        this.count=0;
    }
    public void addVehicles(Vehicle vehicle)
    {
        if(count < Vehicles.length)
        {
           Vehicles[count] = vehicle;
           count++;
           System.out.println("Vehicle added to grage");
        }
        else
        {
            System.out.println("Garge is full");
        }
    }
    public void UpdateVeichle (String brand , String model ,int year ,String NewOwner ,String CurrentOwner)
    {
        boolean found=false;
        for(int i =0; i< count ;i++)
        {
            if(Vehicles[i].getOwnerName().equalsIgnoreCase(CurrentOwner))
            {
                Vehicles[i].setBrand(brand);
                Vehicles[i].setModel(model);
                Vehicles[i].setYear(year);
                Vehicles[i].setOwnerName(NewOwner);
                System.out.println("Vehicle updated successfully");
                found =true;
                break;

            }

        }
        if(!found)
        {
            System.out.println("Vehicle With owner "+CurrentOwner + "not found. update failed.");

        }
        


    }
    public void RemoveVehicle(String ownerName)
    {
        boolean found=false;
        for(int i=0; i<count ;i++)
        {
            if(Vehicles[i].getOwnerName().equalsIgnoreCase(ownerName))
            {
                Vehicles[i] =Vehicles[count-1];
                Vehicles[count-1] = null;
                count--;
                System.out.println("Vehicle removed from garage.");  
                found= true;
                break;          

            }
        }
        if(!found)
        {
            System.out.println("Vehicle with owner "+ownerName+" not found. removal failed");
        }

    }
    public void DisplayVehicles()
    {
        if(count ==0)
        {
            System.out.println("The garage is emty.");
        }
        else
        {
            for(int i=0;i<count;i++)
                {
                    Vehicles[i].DisplayInfo();
                    System.out.println( );
                }
        }
    }

    public void DisplayVehiclDetails(String ownerName)
    {
        boolean found=false;
        for(int i=0;i<count;i++)
        {
            if(Vehicles[i].getOwnerName().equalsIgnoreCase(ownerName))
            {
                Vehicles[i].DisplayInfo();
                found=true;
                break;
            }

        }
        if(!found)
        {
            System.out.println("Vehicle with owner" + ownerName +" Not found. ");

        }
    }    
}

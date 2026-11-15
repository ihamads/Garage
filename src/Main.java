import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Garage g=new Garage();
        Scanner s=new Scanner(System.in);
        int choice=0;

        do{

            System.out.println("Menu: ");
            System.out.println("1. Add a vehicle");
            System.out.println("2. update a vehicle");
            System.out.println("3. remove a vehicle");
            System.out.println("4. Display vehicles");
            System.out.println("5. Display details of a vehicle");
            System.out.println("0. Exit");

            System.out.println("Enter your choice " );
            choice=s.nextInt();
            s.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.println("Choose the vehicle type :");
                    System.out.println("1. Car");
                    System.out.println("2. Motorcycle");
                    System.out.println("3. Truck");

                    System.out.println("Enter the vehicle (1-3) : ");
                    int vehicleTypeChoice = s.nextInt();
                    s.nextLine();

                    switch(vehicleTypeChoice) {
                        case 1:
                            System.out.println("Enter owner name :");
                            String carOwner = s.nextLine();

                            System.out.println("Enter vehicle brand :");
                            String carBrand = s.nextLine();

                            System.out.println("Enter vehicle model :");
                            String carModel = s.nextLine();

                            System.out.println("Enter vehicle year :");
                            int carYear = s.nextInt();
                            s.nextLine();

                            System.out.println("Enter seating capacity : ");
                            int seatingCapacity = s.nextInt();

                            g.addVehicles(new Car(
                                carOwner,
                                carBrand,
                                carModel,
                                carYear,
                                seatingCapacity
                            ));
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Enter owner name of the vehicle to update: ");
                    String updateOwner = s.nextLine();

                    System.out.println("Enter new owner name: ");
                    String owner = s.nextLine();

                    System.out.println("Enter new vehicle brand: ");
                    String brand = s.nextLine();

                    System.out.println("Enter new vehicle model: ");
                    String model = s.nextLine();

                    System.out.println("Enter new vehicle year: ");
                    int year = s.nextInt();

                    g.UpdateVeichle(brand, model, year, owner, updateOwner);
                    break;

                case 3:
                    System.out.println("Enter owner name of the vehicle to remove: ");

                    String removeOwner = s.nextLine();

                    g.RemoveVehicle(removeOwner);
                    break;
                case 4:
                    g.DisplayVehicles();
                    break;
                case 5:                
                    System.out.println("Enter owner name of the vehicle to display details: ");

                    String displayOwner = s.nextLine();

                    g.DisplayVehiclDetails(displayOwner);
                    break;
                case 0:
                    System.out.println("Exiting The program!");
                    break;

                default:
                    System.out.println("Invaild choice. Please enter a vaild option ");


            }   
                

        } while(choice != 0);
    }
}



package hotelSysetm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int couple = 18;
        int family = 10;
        int single = 20;
        int c = 5;
        String type = "";
        int numexist = 0;
        String fullname , phone;
        int numdays , kids = 1 ,  adults = 1 ;
        while (c != 0) {
            // c=1 reservation service
            // c=2 otherClients
            System.out.println("Enter the full name and phone number: ");
            fullname = input.nextLine();
            phone = input.nextLine();
            System.out.print("Service Choice \n Reservation = 1  \n Other Clients = 2\n ");
            c = input.nextInt();

            // Reservation service
            if (c == 1) {
                // choose capacity of room you want
                System.out.println("Enter the number of days: ");
                numdays = input.nextInt();
                System.out.print("Enter the capacity: ");
                
                // 1 single room
                // 2 room of two people
                // 3 family room
                int capacity = input.nextInt();
                if (capacity == 1) {
                    type = "single";
                    numexist = single;
                } else if (capacity == 2) {
                    type = "couple";
                    numexist = couple;
                } else if (capacity >= 3) {
                    type = "family";
                    numexist = family;
                }
                Reservation y = new Reservation(type, numexist);
                // check if room is available
                // return price
                y.room();
                System.out.println();
                // if room is available
                System.out.print("Do you want to continue the reservation? [yes = 1 | no = 0]");
                int cont = input.nextInt();
                System.out.println();
                if (cont == 1) {
                    
                    // number of days
                    // information of client
                    y.info(numdays, fullname, phone);
                    // confirmation part
                    System.out.println();
                    System.out.print("Do you want to confirm? [yes = 1 | no = 0]");
                    int cont1 = input.nextInt();
                    // cont1=1 the client has paid
                    if (cont1 == 1) {
                        if (capacity == 1) {
                            single--;
                        } else if (capacity == 2) {
                            couple--;
                        } else if (capacity == 3) {
                            family--;
                        }
                        // end of reservation service
                        System.out.println("Reservation Done!");
                        System.out.println("\n");
                    }
                }
            }
            // otherClients services
            else if (c == 2) {
                System.out.println("Enter the service: ");
                // choice 1 = Restaurant
                // choice 2 = Bar
                // choice 3 = Cafe
                // choice 4 = pool
                System.out.print("Choice 1 = Restaurant \n"
                        + " Choice 2 = Bar\n"
                        + " Choice 3 = Cafe\n"
                        + " Choice 4 = Pool\n");
                int choice = input.nextInt();
                if(choice == 4){
                    System.out.println("Enter the number of kids: ");
                    kids = input.nextInt();
                    System.out.println("Enter the number of adults: ");
                    adults = input.nextInt();
                }
                System.out.println("Total price is : " + 
                        OtherClients.servicePrice(choice, kids, adults));
            }
            System.out.println("---------------------\n");
            // run the program for another client
            System.out.print("Another service? [yes = 1 | no = 0]");
            c = input.nextInt();
        }

        System.out.print("End of program");
    }

}



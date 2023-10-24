package hotelSysetm;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int towpersons=18;
			int family=10;
			int single=20;
			int c=5;
			String type="";
			int numexist=0;
			while(c!=0) {
				// c=1 reservation service
				//c=2 otherClients
				System.out.print("choice service \n 1=reservation service \n 2=otherClients\n ");
				c=input.nextInt();
	            //reservation service
				if(c==1) {
					//choice capacity of room you want 					
					System.out.print("enter the capacity : ");
					// 1 single room
					// 2 room of tow persons
					// 3 family room
					int capacity=input.nextInt();
					if(capacity==1) {
						type="single";
						numexist=single;
					}else if(capacity==2) {
						type="towpersons";
						numexist=towpersons;
					}else if(capacity==3) {
						type="family";
						numexist=family;
					}
					Reservation y=new Reservation(type,numexist);
					//check if room available 
					//return price
					y.room();
					System.out.println();
					// if room is available
					System.out.print("do you want to continue? [y=1/n=0]");
					int cont=input.nextInt();
					System.out.println();
					if(cont==1) {
				    //number of days
					//information of client
					y.info(3,"wedad badri", "0663413181");
					//confirmation part
					System.out.println();
					System.out.println("do you want to confirm? [y=1/n=0]");
					int cont1=input.nextInt();
					//cont1=1 the client has paid
					if(cont1==1) {
						if(capacity==1) {
							single--;
						}else if(capacity==2) {
							towpersons--;
						}else if(capacity==3) {
							family--;
						}
						// and of reservation service
						System.out.println("reservation done");
						System.out.println("\n");
					}
					}
				}
				//otherClients services
				else if(c==2) {
					System.out.println("enter the service: ");
					// choice 1 = Restaurant 
                    //choice 2 = Bar
                    //choice 3 = Cafe
                    //choice 4 = pool
					System.out.print("choice 1 = Restaurant \n"
							+ " choice 2 = Bar\n"
							+ " choice 3 = Cafe\n"
							+ " choice 4 = pool\n");
					int choice=input.nextInt();
					System.out.println("total prix is : "+ otherClients.servicePrice(choice,2,4));
					
				}
				System.out.println("---------------------\n");
				//run the program for another client 
				System.out.print("another service? [y=1/n=0]");
				c=input.nextInt();
				
			}
		
		System.out.print("end of program");
	}

}



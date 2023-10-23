package hotelSysetm;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		System.out.println("---------------------");
		Scanner input = new Scanner(System.in);
			//int towpersons=18;
			//int family=10;
			int c =input.nextInt();
			int single=20;
			while(c!=0) {
				if(c==1) {
					Reservation y=new Reservation("single",single);
					y.room();
					System.out.println("---------------------");
					y.info(3,"wedad badri", "0663413181");
					System.out.println("---------------------");
					single=y.num;
				}
				c=input.nextInt();
				
			}
		
		
	}

}

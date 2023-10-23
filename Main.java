package hotelSysetm;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			int towpersons=18;
			int family=10;
		        int single=20;
			char c =input.next().charAt(0);
			
			while(c!='n') {
				if(c=='y') {
					Reservation y=new Reservation("single",single);
					y.room();
					System.out.println("---------------------");
					y.info(3,"wedad badri", "0663413181");
					System.out.println("---------------------");
					single=y.num;
				}
				c=input.next().charAt(0);
				
			}
		
		
	}

}

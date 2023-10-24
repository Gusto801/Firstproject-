package hotelSysetm;

public class Reservation {
	  String capacity;
	  int num;
	  public  Reservation(String capacity,int num) {
		  this.capacity=capacity; 
		  this.num=num;
	  } 
	  public int prix(String capacity) {
		  if(capacity=="single")
			  return 600;
		  else if(capacity=="towpersons")
			  return 900;
		  else if(capacity=="family")
			  return 1200;
		  else 
			  return 0;
	  }
	  public void room() {
		  boolean x=true;
		  if(capacity=="single") {
			  if(num !=0) {
				  System.out.println("Available\n" +"prix is : "+prix( capacity)  ); 
				  System.out.println("number of rooms availble : "+num );
			  }else {
				  x=false;
			  }  
		  }
	  else if(capacity=="towpersons") {
			  if(num !=0) {
				  System.out.println("Available\n" +"prix is : "+ prix( capacity)  ); 
				  System.out.println("number of rooms availble : "+num );
			  }else {
				  x=false;
			  }  
		  }
		  else if(capacity=="family") {
			  if(num !=0) {
				  System.out.println("Available\n" +"prix is : "+ prix( capacity) ); 
				  System.out.println("number of rooms availble : "+num );
			  }else {
				  x=false;
			  }  
		  }
		  else
			  x=false;
		  if(x==false)
			  System.out.print("Unavailable");
      
}
	  public void info(int numofday,String fullname,String phone) {
		  System.out.println("dear "+ fullname + " total prix is : "+prix(capacity)*numofday );  
	  }
	 /* public void comfirmation(char c) {
		  if(c=='y' || c=='Y') {
			  System.out.println("reservation done");
			  
		  }
		  if(c=='n' || c=='N') {
			  return;
		  }
	  }*/
		  
	 
}


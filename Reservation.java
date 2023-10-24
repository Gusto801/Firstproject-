package hotelSysetm;

public class Reservation {
    String capacity;
    int num;

    public Reservation(String capacity, int num) {
        this.capacity = capacity;
        this.num = num;
    }
    
    //function of the prices depending on the capacity
    
    public int prix(String capacity) {
        if ("single".equals(capacity))
            return 600;
        else if ("couple".equals(capacity))
            return 900;
        else if ("family".equals(capacity))
            return 1200;
        else
            return 0;
    }
    
    //function to check the availibility of the rooms and thier numbers
    
    public void room() {
        boolean x = true;
        if ("single".equals(capacity)) {
            if (num != 0) {
                System.out.println("Available\n" + "Price is : " + prix(capacity));
                System.out.println("Number of rooms available : " + num);
            } else {
                x = false;
            }
        } else if ("couple".equals(capacity)) {
            if (num != 0) {
                System.out.println("Available\n" + "Price is : " + prix(capacity));
                System.out.println("Number of rooms available : " + num);
            } else {
                x = false;
            }
        } else if ("family".equals(capacity)) {
            if (num != 0) {
                System.out.println("Available\n" + "Price is : " + prix(capacity));
                System.out.println("Number of rooms available : " + num);
            } else {
                x = false;
            }
        } else {
            x = false;
        }
        if (!x)
            System.out.print("Unavailable");
    }
        
    //Printing the client's information
   
    public void info(int numOfDay, String fullname, String phone) {
        System.out.println("Dear " + fullname + ", total price is : " + prix(capacity) * numOfDay);
    }

}


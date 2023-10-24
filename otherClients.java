package hotelSysetm;

public class otherClients {
        //String type = "other";
        //int choice; // choice 1 = Restaurant 
                    //choice 2 = Bar
                    //choice 3 = Cafe
                    //choice 4 = pool
        
        public final static double restPrice = 19000.0;
        public final static double barPrice = 18000.0;
        public final static double cafePrice = 15000.0;
        //public double poolPrice;
        public final static double kidPoolprice = 500;
        public final static double adultPoolprice = 1000;
       // public int kids; //how many kids in the family to use the pool
       // public int adults; //how many adults in the family 
        
       /* public otherClients( int choice){
          //  this.type = type;
            this.choice = choice;
        }*/
        
        public static double servicePrice(int choice, int numOfadultPersons ,int numOfkids){
            if( choice == 1)
                return restPrice*numOfadultPersons;
            else if(choice == 2)
                return barPrice*numOfadultPersons;
            else if( choice == 3)
                return cafePrice*numOfadultPersons;
            else{ //Pool section
                return (numOfkids * kidPoolprice) + (numOfadultPersons* adultPoolprice);
            }
        }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelsystem;

/**
 *
 * @author PC
 */
public class otherClients {
        String type = "other";
        int choice; // choice 1 = Restaurant 
                    //choice 2 = Bar
                    //choice 3 = Cafe
                    //choice 4 = pool
        
        public final double restPrice = 19000.0;
        public final double barPrice = 18000.0;
        public final double cafePrice = 15000.0;
        public double poolPrice;
        public final double kidPool = 500;
        public final double adultPool = 1000;
        public int kids; //how many kids in the family to use the pool
        public int adults; //how many adults in the family 
        
        public otherClients(String type , int choice){
            this.type = type;
            this.choice = choice;
        }
        
        public double servicePrice(String type , int people){
            if(this.type.equals("other") && choice == 1)
                return restPrice;
            else if(this.type.equals("other") && choice == 2)
                return barPrice;
            else if(this.type.equals("other") && choice == 3)
                return cafePrice;
            else{ //Pool section
                return (kids * kidPool) + (adults * adultPool);
            }
        }
}

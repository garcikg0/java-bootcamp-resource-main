import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */
        System.out.println("How many pizza toppings do you want?");
        int toppingsAmount = scan.nextInt();

        // Task 2 – Create the array here
        String[] toppings = new String[toppingsAmount];

        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         * 
         */
        System.err.println("Great, enter each topping!");

        String throwaway = scan.nextLine();
        for (int i = 0; i < toppingsAmount; i++) {
            System.out.print(i + ". ");
            String topping = scan.nextLine();
            toppings[i] = topping;
        }

        /** Task 4 – Pick up the user's toppings and store them in the array.
         *  
         *  See the workbook article for more detail  
         * 
         */

        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */
        System.out.println("\nThank you! Here are the toppings your ordered");
        for (int i= 0; i < toppings.length; i++) {
            System.out.println(i + ". " + toppings[i]);
        }

        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */
        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();


         
    }
}
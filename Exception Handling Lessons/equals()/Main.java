import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "blue");
        Car sameCar = new Car("Honda", "blue");
        Scanner scan = new Scanner(System.in);

        System.out.println(car.equals(sameCar));
    }

}

/**
 * We can use the equals method to check if two objects are equals.
 * 
 * The default equals() method compares references of two objects.
 * We customize the equals() method to compare the fields of the objects.
 * 
 * public boolean equals(Object obj) {
 *  1. return false if obj is null
 *  2. return false if obj is not instance of correct class
 *  3. convert obj to the correct class
 *  4. compare fields from both objects
 *  5. return the result
 * }
 */

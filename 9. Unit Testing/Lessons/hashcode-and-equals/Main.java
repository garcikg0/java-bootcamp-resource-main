import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2016);
        System.out.println("Nissan: " + nissan.hashCode());

        Car dodge = new Car("Dodge", 2018);
        System.out.println("Dodge: " + dodge.hashCode());

        Car toyota = new Car("Toyota", 2016);
        System.out.println("Toyota: " + toyota.hashCode());

        Car nissan2 = new Car(nissan);
        System.out.println("Nissan: " + nissan2.hashCode());
        
        HashMap<Car, Double> prices = new HashMap<Car, Double>();
        prices.put(nissan, 10000.);
        prices.put(dodge, 12000.);
        prices.put(toyota, 14000.);
        
        nissan.equals(nissan2);
        System.out.println(prices.get(nissan2));
    }
}

/*
 * hashCode() assigns every object an integer.
 * equal objects MUST have the same hashCode. 
 * Otherwise, you will get bug with hash-based collections like hashMap.
 * 
 * HashMap sorts keys into buckets
 * hashCode finds which buket the key is in. Then, equals() checks for equality. 
 * When you add an equals() method, you must ALWAYS add a hashCode() method. 
 * 
 * The hashCode() method must assign equals objects the same hashCode.
 * When equals objects have the same hash code, the HashMap can easily find the buck of the key you're interested in. 
 * 
 * Objects.hash(fields go here)
 * The method hash() returns a hashCode based on the fields that it receives and it knows to assign equals objects to the same hashCode. 
 * Implementation in Car.java
 * 
 * When you add an equals() method, you must also add a hashCode() method. 
 * 
 * RECAP
 * equal objects MUST share the same hashCode.
 * When you add an equals() method, you must ALWAYS add a hashCode() method. 
 * The hashCode() method must assign equal objects the same hashCode. 
 * HashMap uses the hashCode to find which bucket the key is in. 
 */
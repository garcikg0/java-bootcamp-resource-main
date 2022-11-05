import java.util.HashMap;

public class KeyValues {
  
    public static void main(String[] args) {
        String[] vegetables = new String[] {"Cauliflower", "Spaghetti Squash", "Parsley"};
        double[] prices = new double[] {4.99, 1.99, 6.99};

        HashMap<String, Double> items = new HashMap<String, Double>();
        items.put("Cauliflower", 4.99);
        items.put("Spaghetti Squash", 1.99);
        items.put("Parsley", 6.99);

        items.put("Parsley", 3.99);

        items.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
  
}

/**
 * A HashMap stores key-value paris. It is useful when there is parity between data. 
 * Every key is like a variable pointing to a value. 
 * 
 * Every HashMap has a method called put. Put adds an entry to the HashMap.
 * 
 * Every HashMap has a method called get. It gets a value based on its key.
 * 
 * HashMap entries are not ordered. The placement of entries is random. 
 * You can't index a HashMap. You can get a value based on its key. 
 * 
 * Put can add or update an entry.
 * It adds an entry if the key doesn't exist. It updates an entry if the key already exists. 
 * 
 * It's not possible to update a key. 
 * 
 * For HashMap to retrieve a key, it's not enought for an object to "equal" the key. 
 * It must also share the same hashCode.
 * 
 * NEXT LESSON - hashCode() --> 'hashcode-and-equals';
 * When you add an equals() method, you mus also add a hashCode() method.
 * When you add an equals() method, you must ALWAYS add a hashCode() method.
 * The hashCode() method must assign equal objects the same hashCode. 
 */
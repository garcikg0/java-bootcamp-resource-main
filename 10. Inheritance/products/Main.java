import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import models.Discountable;
import models.Pants;
import models.Product;
import models.Shirt;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        try {
            Product[] products = getData();
            Arrays.sort(products);
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
    public static Product[] getData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        Scanner scan = new Scanner(fis);

        Product[] products = new Product[18];
        
        for (int i = 0; scan.hasNextLine(); i++) {
            switch(scan.next()) {
                case "PANTS": products[i] = new Pants(scan.nextInt(), scan.nextDouble(), scan.next(), scan.next()); break;
                case "SHIRT": products[i] = new Shirt(Shirt.Size.valueOf(scan.next()), scan.nextDouble(), scan.next(), scan.next()); break;
            }
        }
        scan.close();
        return products;
    }
}

/**
 * A class that extends another class inherits from it. 
 * Shirt and Pants must etend the Product class. 
 * 
 * When two classes share common fields:
 *  -NEVER define the same fields in each class. 
 *  -Each class should inherit common fields from a Parent class. 
 * 
 * Child classes inherit from a Parent class. 
 * 
 * PARENT CONSTRUCTOR AND super()
 * A child class can use the constructor of its parent class. 
 * The child class uses its constructor to update its fields.
 * The child class uses the Parent constructor to update inherited fields. 
 * super() - the parent class constructor.
 * super(arguments) - super calls the parent constructor
 * 
 * super() FOR COPY CONSTRUCTOR
 * super - parent class.
 * super() - the parent class constructor.
 * 
 * GETTERS AND SETTERS
 * A child class can inherit methods from its parent class. Child class inherits getters/setters from parent class. 
 * 
 * ABSTRACT CLASS
 * You can create an object of a class.
 * You cannot create an object of an abstract class.
 * Make a class abstract if its only purpose is inheritance.
 * Problem: You shouldn't be allowed to create an object of the Product class. 
 * Solution: make Product class abstract. It isn't allowed to create an object of Product anymore, the only puprpose of the Product class is to provide inheritance for pants and shirt.  
 * 
 * hashCode() AND equals() TO CHILDREN CLASSES
 * super.method() calls a method from the Parent class.
 * The hashCoode method needs to always stay consistent with your equals method. 
 * this.method vs. super.method
 *  -'this' can all local and inherited methods.
 *  -'super' can only call inherited methods. 
 * use super to call inherited methods! 
 * 
 * ENUM
 * Use an enum to ensure something can be a limited number of values. 
 * 
 * ABSTRACT METHOD
 * If a parent defines an abstract method, the child class MUST override it. 
 * Make a method abstract to force a child class to override it. 
 * 
 * public abstract void pay(double price);
 * 
 * An abstract method forces a child class to override it. 
 * Make a method abstroct to force a child class to override it. 
 * 
 * INTERFACE
 * An interface defines methods that a class needs to implement. 
 * If a class implements an interface, it must override every method inside the interface.
 * 
 * An interface: 
 *  - is a contract
 *  - defines methods that a class must implement.
 * 
 * Use an interface to define behavior that's required from a class
 * If a class implements an interface, it must override all of the methods inside of the interface.
 * 
 * public interface name {
 * 
 *      public void method1();
 *      public void method2();
 *      public void method3();
 * 
 * }
 * Inside the interface, you can define method signatures
 * A class that implements this interface must override every method inside of it. 
 * 
 * Interfaces allow for polymorphism. 
 * 
 * Inside the Parent, you can force every child to override an 'abstract' method
 * 
 * Otherwise, use an 'interface' to define behavior that's required from a class.
 * 
 * 
 * THE COMPARABLE METHOD
 * The sort() method can sort Comparable objects.
 * An interface or a class can received a Generic.
 * sort() uses compareTo to sort Comparable objects. 
 * 
 * SORTING ALPHABETICALLY
 * new file --> 10.Inheritance --> string-comparable
 *  * String also implements Comparable
 * So, String overrides compareTo
 * 
 * compareTo() for String returns: 
 *  - negative when the characters in the first STring have a lower unicode value.
 *  - zero if the Strings are identical. 
 * - positive when the characters in the first String have a higher unicode value
 * 
 * Problem: Math.round() rounds to the nearest integer.
 * Pitfall: If the difference is less than 0.5, Math.round() returns 0 which implies equality.
 * Solution: Double.compare(double, double) is more accurate when comparing decimal points. 
 * 
 * 
 * POLYMORPHISM IN LISTS
 * Many collection types implement the list interface. 
 *  - ArrayList implements the List interface.
 *  - LinkedList implements the List interface. 
 * new file --> 10.Inheritance --> polymorphism-lists
 * 
 * ArrayList and Linkedlist implement List.
 * List
 *  - Interface: defines methods required from a class. In other words, each class signed a contract to override every method inside the lowest interface.
 * 
 * ArrayList vs. LinkedList
 *  - Performance: Linkedlist usually the wrong choice.
 * 
 * Polymorphism: ArrayList and LinkedList can take the form of the interface they implement.
 * 
 * POLYMORPHISM IN MAP: HashMap vs. TreeMap vs. LinkedHashMap
 *  -HashMap directly implements the Map interface.
 *  -LinkedHashMap (child of HashMap) indirectly implemnts Map.
 *  -TreeMap indirectly implements Map. TreeMap implements the sort map interface, which in turn implements the map interface. 
 * All 3 classes implement the map interface, whether it's directly or indirectly. 
 * new file --> 10.Inheritance --> polymorphism-maps
 * 
 *  * Map
 *  -Interface: defines methods required from a class. 
 * 
 * HashMap, LinkedHashMap, TreeMap
 *  -HashMap: not ordered. (LinkedHashMap and TreeMap are ordered.)
 * 
 * TreeMap
 *  -Can sort entries according to compareTo()
 * 
 * LinkedHashMap
 *  -Sorted based on insertion order. 
 * 
 * TreeMap and LinkedHashMap follow an order.
 * HashMap entries are unordered. 
 * 
 * When to use Map?
 * -When there is parity between data
 * 
 * When to use HashMap?
 * -For performance, use HashMap when order isn't important. 
 * 
 * When to use TreeMap?
 * -To sort entries according to what YOU specify. 
 * 
 * When to use LinkedHashMap?
 * -To sort entries according to insertion order. 
 * 
 * Interfaces aloow for polymporphism.
 * Why is Polymorphism useful? 
 * -flexibility. 
 * 
 * In this course, HashMap is favored over TreeMap or LinkedHashMap.
 * -because it offers the best performance out of the three
 * -it's not common to need the entries to be sorted. 
 * 
 * 
 * 
 */


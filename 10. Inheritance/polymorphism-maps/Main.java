import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Book, String> books = new HashMap<Book, String>();
        // TreeMap<Book, String> books = new TreeMap<Book, String>();
        // LinkedHashMap<Book, String> books = new LinkedHashMap<Book, String>();

        // Map<Book, String> books = new HashMap<Book, String>();
        // Map<Book, String> books = new TreeMap<Book, String>();
        // Map<Book, String> books = new LinkedHashMap<Book, String>();

        books.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        books.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        books.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        books.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");

        printMap(books);
        System.out.println("\n\n" + books.keySet().toArray()[2]);
    }  

    public static void printMap(Map<Book, String> map) {
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        });
    }
}

/**
 * Map
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
 */
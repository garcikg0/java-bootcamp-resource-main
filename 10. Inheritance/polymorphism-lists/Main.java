import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        
        list.add(2);
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        // List<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.size();
        list2.isEmpty();
        // list2.contains(o);
        list2.toArray();
    }
}

/**
 * ArrayList and Linkedlist implement List.
 * List
 *  - Interface: defines methods required from a class. In other words, each class signed a contract to override every method inside the lowest interface.
 * 
 * ArrayList vs. LinkedList
 *  - Performance: Linkedlist usually the wrong choice.
 * 
 * Polymorphism: ArrayList and LinkedList can take the form of the interface they implement.
 * 
 */

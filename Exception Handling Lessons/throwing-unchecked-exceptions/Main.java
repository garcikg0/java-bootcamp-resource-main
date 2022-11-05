import models.Employee;
import models.Store;

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Paul", "Stocker");
        Employee assisManager = new Employee("Nicholas", "Assistant Manager");
        Employee manager = new Employee("Demian", "Manager");

        Store store = new Store();
        store.setEmployees(0, stocker);
        store.setEmployees(1, assisManager);
        store.setEmployees(2, manager);

        System.out.println(store);
        store.open();
        
    }
}

/**
 * Why throw unchecked exceptions?
 *  =forbid the caller from misusing methods/cons.
 * 
 * Most common exceptions to throw:
 * -IllegalArgumentExceptions
 * -IllegalStateException
 * 
 * Should the copy constructor throw exceptions? No. 
 * 
 * IllegalArgumentException - method/constructor receives illegal values.
 * 
 * IllegalStateException = object calls a method with an illegal state.
 */
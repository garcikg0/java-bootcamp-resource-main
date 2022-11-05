public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ryan", "Canadian"); // Mutable or Immutable? Immutable
        // Person class doesn't have any setters or methods to change it. 
        
        Person person2 = person;
        person2 = new Person("John", "American");
    }
}

/**
 * Mutator - another name for "setter".
 * 
 * Mutable Ojbect - object that can update its fields. 
 * It uses mutators (setters) to update fields.
 * 
 * Immutable Object - object that cannot update its fields.
 * It does not have mutators (setters).
 * 
 * Mutable objects are vulnerable to the reference trap.
 * Immutable objects are immune to the reference trap.
 * 
 * Every array is a mutable object.
 */
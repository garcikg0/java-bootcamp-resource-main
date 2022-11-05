public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 10000); //Mutable or Immutable? --> Mutable
        car.setMake("Honda");
        Car car2 = car;
        car2.setPrice(8000);

        System.out.println(car.getPrice());
        System.out.println(car2.getPrice());
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
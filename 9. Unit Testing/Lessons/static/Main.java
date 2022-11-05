public class Main {
  
    public static void main(String[] args) {
        Employee zack = new Employee("Zack", "Programmer");
        Employee gio = new Employee("Gio", "Analyst");
        Employee thomas = new Employee("Thomas", "Specialist");
        System.out.println(Employee.getHiredCount());
    }
  
}

/**
 * STATIC VARIABLES
 * static variable belongs to a class. It does NOT belong to an object.
 * Fields belong to an object. 
 * 
 * Methods belong to an object. 
 * static methods belong to the class.
 * 
 * Accessing a static variable from an object doesn't make sense. 
 * A static method belongs to the class. You can call it directly from the class. 
 * 
 * STATIC METHODS
 * A static method can only access static variables. 
 * 
 * Why can't a static method access fields?
 * A static method belongs to the class. A field belongs to a particular object. 
 * 
 * A static method can only access static variables.
 * A static method can only access other static methods. 
 * 
 * Why can't a static method access normal methods? 
 * A static method belongs to the class. A normal method belongs to a particular object. 
 * 
 * IMPORTANT: 
 * A static method can only access static variables.
 * A static method can only access other static methods. 
 * 
 * Why does everything in Main have to be static? 
 * It doesn't make sense to create an object of the Main class. 
 * 
 * Why do class variables in Main need to be static? 
 * A static method can only access static variables. 
 * 
 * Why do other methods in Main need to be static? 
 * A static method can only access other static methods. 
 * 
 * STATIC FINAL CONSTANTS
 * A constant is a value that can never change. 
 * Why do we use constants? To ensure values that shouldn't change, don't!
 * 
 * Whey are constants static?
 * They belong to the class. Their value is the same across every object. 
 * 
 * Why are constants final? 
 * final means you can never update the variable. 
 * 
 * Never plaining write an important value! 
 * Use a static final constant instead. 
 * 
 * Should the constant be private? Yes!
 */

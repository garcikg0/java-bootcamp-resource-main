public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zack", 27);
        Person person2 = new Person(person);

        System.out.println(person.toString());
    } 
}

/**
 * INHERITANCE
 * class Object is the ancestor of every class. 
 * Every class inherits methods from: class Object. 
 * 
 * OVERRIDING equals()
 * A class can customize (override) methods that it inherits. 
 * 
 * ==
 * When the double equal operator is used for objects, it compares the references. 
 * It returns true if the references are equal. 
 * Never use the double equal [==] or .equals() to compare objects. 
 * 
 * Override - change the logic of an inherited method. 
 * 
 * OVERRIDING hashCode()
 * Objects that are equal must share the same hashCode. 
 * When you overide equals(), you must override hashCode().
 * 
 * Equality Contract:
 * Objects that are equal must share the same hashCode().
 * When you overide equals(), you must override hashCode().
 * 
 * Equality Contract: Objects that are deemed equal must always share the same hashCode().
 * - When you override equals(), it must return true for objects that share the same field values.
 * – When you override hashCode() , it must return a number that depends on an object's fields. As a result, it will return the same number for objects with similar field values.
 * 
 * OVERRIDING toString()
 * 
 * POLYMORPHISM
 * An object can take many forms. 
 * Inheritance allows an object to take many forms. 
 * It allows an object to be polymorphic. 
 * An object can take its own form
 * An object can take the form of the class it inherits from. 
 * 
 * PARENT CLASS
 * next lesson - 10.inheritance --> products
 */

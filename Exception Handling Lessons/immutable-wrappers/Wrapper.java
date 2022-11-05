public class Wrapper {
    public static void main(String[] args) {
        // int wholeNumber = 5;
        // Integer wholeNumber = new Integer(5); depricated
        Integer wholeNumber = 5;
        Integer numberTwo = wholeNumber;
        numberTwo = 10;
        // long largeWholeNumber = 5000000000L;
        // Long largeWholeNumber = new Long(5000000000L); depricated
        Long largeWholeNumber = 5000000000L;
        // double decimal = 5.493;
        // Double decimal = new Decimal(5.493); depricated
        Double decimal = 5.493;
        // char letter = 'b';
        // Character letter = new Character('b'); depricated
        Character letter = 'b';
    }
}

/**
 * a Wrapper is an immutable class that wraps around a primitive.
 * For every primitive, there is an immutable class type (Wrapper).
 * Ex. Integer - immutable class that wraps around int. 
 * Ex. Long, Double, Character, String
 * 
 * Wrapper objects are immutable.
 * 
 * When to use Primitive vs Wrapper:
 *  -use Primitive 90% of the time. (takes up less space and faster)
 *  -use a Wrapper only when you NEED to. Examples:
 *      -Needs to be nullable.
 *      -Needs to call methods.
 * 
 * String is not a Wrapper class: Although String is immutable, it does not wrap around a primitive. 
 * 
 * Reminder: A wrapper class must be immutable and wrap around a primitive. String is immutable, but it does not wrap a primitive. 
 * 
 * 
 */
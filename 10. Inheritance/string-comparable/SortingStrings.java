public class SortingStrings {
    public static void main(String[] args) {
        String john = "John";
        String amy = "Amy";
        String jane = "Jane";

        System.out.println(jane.compareTo(john));
        
    }
}

/**
 * String also implements Comparable
 * So, String overrides compareTo
 * 
 * compareTo() for String returns: 
 *  - negative when the characters in the first STring have a lower unicode value.
 *  - zero if the Strings are identical. 
 * - positive when the characters in the first String have a higher unicode value
 */
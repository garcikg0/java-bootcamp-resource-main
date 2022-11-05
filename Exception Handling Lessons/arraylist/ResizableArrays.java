import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Joe");
        names.add("Jim");
        names.add("John");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        names.set(0, "Joe Fresh");
        names.add(3, "Katie");
        names.remove(2);
        names.clear();
    }
}

/**
 * Array vs ArrayList
 *  -Array: fixed in size.
 *  -ArrayList: resizable.
 * 
 * The ArrayList:
 *  -can add/remove elements
 *  -can only store objects. It cannot store primitives. 
 * 
 * ArrayList<class type> collection = new ArrayList<class type>();
 * 
 * Use Arrays when size is fixed (less overhead).
 * Use ArrayList when size can vary. 
 * 
 * ArrayList can only store objects.
 */

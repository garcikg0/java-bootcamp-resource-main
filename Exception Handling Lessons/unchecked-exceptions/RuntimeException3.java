import java.util.Scanner;

public class RuntimeException3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Please enter a number: ");
                if (scan.hasNextInt()) {
                    System.out.println(scan.nextInt());
                    break;
                } else {
                    scan.nextLine();
                    System.out.println("not a number");
                }
            }
            scan.close();
        }
}


/**
 * Rule of thum:
 *  catch checked exceptions (outside application's control).
 *  fix unchecked exceptions (badly written code).
 */
package practical;
import java.util.Scanner;
public class logicaloperator {
	
	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter first number (x): ");
	        int x = input.nextInt();
	        System.out.print("Enter second number (y): ");
	        int y = input.nextInt();
	        System.out.print("Enter third number (z): ");
	        int z = input.nextInt();
	        System.out.println("\nLogical AND (&&) operations:");
	        System.out.println((x > y) && (y > z));
	        System.out.println((x > y) && (y < z));
	        System.out.println("\nLogical OR (||) operations:");
	        System.out.println((x < y) || (y > z));
	        System.out.println((x > y) || (y < z));
	        System.out.println((x < y) || (y < z));
	        System.out.println("\nLogical NOT (!) operations:");
	        System.out.println(!(x == y));
	        System.out.println(!(x > y));
	    }
	}
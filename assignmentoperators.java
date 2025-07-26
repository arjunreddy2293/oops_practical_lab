package practical;
import java.util.Scanner;
public class assignmentoperators {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number (a): ");
	        int a = input.nextInt();
	        int variable;

	        // assign using =
	        variable = a;
	        System.out.println("variable using =: " + variable);

	        // assign using +=
	        variable += a;
	        System.out.println("variable using +=: "+variable);
	        variable *= a;
	        System.out.println("variable using *=: " + variable);
	    }
	}



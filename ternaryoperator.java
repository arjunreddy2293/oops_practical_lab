package practical;
import java.util.Scanner;
public class ternaryoperator {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter number of days in February: ");
	        int februaryDays = input.nextInt();
	        String result;
	        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	        System.out.println(result);
	    }
	}




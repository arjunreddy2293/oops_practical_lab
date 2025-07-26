package practical;
import java.util.Scanner;
public class incrementdecrement {
	public static void main(String args[]) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter value of a : ");
	int a = scanner.nextInt();
	System.out.println("enter value of b : ");
	int b = scanner.nextInt();
	int result1,result2;
	System.out.println("value of a :"+a );
	
	result1 = ++a;
	System.out.println("value of a after increment is :"+result1);
	
	System.out.println("value of b :"+b);
	
	result2 = --b;
	
	System.out.println("value of b after decrement is :"+result2);
	
	}
}
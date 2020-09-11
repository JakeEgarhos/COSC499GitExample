import java.util.Scanner;

public class exampleCode {

	public static void main(String[] args) {
		/* This is a program that will take two numbers from the user. 
		 * The first feature will be adding the two numbers together.
		 * The second feature will be subtracting the second number from
		 * the first one.
		*/

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println("Would you like to add or subtract the two numbers? (0 for add, 1 for subtract)");
		int addOrSub = input.nextInt();

		//Feature 1 - Add the two numbers and print the result
		
		
		if (addOrSub == 0) {
			System.out.println("The sum is " + add(num1, num2)); 
			}
		}

			
	public static int add (int num1, int num2) {
		int result = num1 + num2;
		return result; 
	}
}



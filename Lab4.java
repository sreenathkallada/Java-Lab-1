import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:  ");
		int number1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = input.nextInt();
		System.out.println("Enter the operation(Supported operations '+,-,*,/'): ");
		String operation = input.next();
		int result = 0;
		
		switch (operation) {
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			result = number1 / number2;
			break;

		default:
			System.out.println("Enter a valid input");
			break;
		}
		System.out.println("The final result is : " + result);
		
		input.close();
		
	}

}

import java.util.Scanner;
public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		float number1 = input.nextFloat();
		System.out.print("Enter the second number: ");
		float number2 = input.nextFloat();
		
		System.out.println("The result is : "+ (number1*number2));
		input.close();
	}

}

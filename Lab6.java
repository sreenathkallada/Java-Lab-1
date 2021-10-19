import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = input.nextInt();
		
		System.out.println("The result is : "+ (number1+number2));
		input.close();
	}

}

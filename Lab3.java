import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int number = input.nextInt();

	
	String result = (number%2 == 0) ? (result = "Even"): (result = "Odd");
		System.out.print("The number " + number + " is an " + result + " number.");
	input.close();
	}
}
	

import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = input.nextInt();
		if (number%2 == 0) {
			System.out.print("The number "+ number + " is an even number");
		} else {
			System.out.print("The number "+ number + " is an odd number");
		}
		input.close();
	}

}

import java.util.Scanner;
public class Lab9 {

	public static void main(String[] args) {
		// TODO Swapping 2 numbers using temp variables
		
		int a, b, temp;
		System.out.println("Enter the first number: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		System.out.println("Enter the second number: ");
		b = input.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping");
		System.out.println("Swapped first number :  "+ a);
		System.out.println("Swapped second number :  "+ b);
		input.close();
		
		
		
		
		
	}

}

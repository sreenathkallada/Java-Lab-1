import java.util.Scanner;
public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the character(If string,only first value considered) : ");
		String character = input.next();
		int ascii = character.charAt(0);
		System.out.println("The ascii value of "+ character + " is " + (int)ascii);
		input.close();
	}

}

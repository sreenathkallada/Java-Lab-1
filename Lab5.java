import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the alphabet(Case sensitive- Only lowercase Supported): ");
		String alphabet = input.next();
		switch (alphabet) {
		case "a":
		case "e":	
		case "i":
		case "o":
		case "u":
			
			System.out.println("The letter " + alphabet + " is a vovel");
			break;

		default:
			System.out.println("The letter " + alphabet + " is a consonant");
			break;
		}
		
		input.close();
	}

}

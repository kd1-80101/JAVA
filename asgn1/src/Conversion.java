import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		int a;
		int choice;
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE NUMBER TO CONVERT : ");
		a = sc.nextInt();
		System.out.println("ENTERED  NUMBER : " + a);
		do {
			System.out.println("_______________________________");
			System.out.println("ENTER CHOICE");
			System.out.println("0.EXIT");
			System.out.println("1.CONVERT INTO BINRARY");
			System.out.println("2.CONVERT INTO OCTAL");
			System.out.println("3.CONVERT INTO HEXADECIMAL ");
			System.out.println("_______________________________");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				String binary = Integer.toBinaryString(a);
				System.out.println("CONVERTED BINARY NUMBER : " + binary);
				break;
			case 2:
				String octal = Integer.toOctalString(a);
				System.out.println("CONVERTED OCTAL NUMBER : " + octal);
				break;
			case 3:
				String hex = Integer.toHexString(a);
				System.out.println("CONVERTED OCTAL NUMBER : " + hex);
				break;
			case 0:
				System.out.println("THANX FOR USING OVER APPLICATION......:)");
				break;
			default:
				System.out.println("YOU HAVE ENTERED WRONG CHOICE ...:( ");
				break;

			}
		} while (choice != 0);
	}

}

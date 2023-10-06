import java.util.Scanner;

public class CheckDataType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		System.out.println("ENTER THE NUM1 OF DOUBLE TYPE :");

		if (sc.hasNextDouble() != sc.hasNextInt()) {
			num1 = sc.nextDouble();
			System.out.println("___________________________________");
			System.out.println("ENTER THE NUM2 OF DOUBLE TYPE :");

			if (sc.hasNextDouble() != sc.hasNextInt()) {
				num2 = sc.nextDouble();
				double result = ((num1 + num2) / 2);
				System.out.println("AVERAGE OF NUM1 AND NUM2 :" + result);
			}

			else
				System.out.println("ENTERED NUMBER NUM2 IS NOT DOUBLE");

		}

		else
			System.out.println("ENTERED NUMBER NUM1 IS NOT DOUBLE");

	}

}

import java.io.IOException;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		ExceptionLineTooLong e1 = new ExceptionLineTooLong();
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("ENTER THE STRING :");
			e1.accept(sc);
			System.out.println(e1.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

import java.util.Scanner;
import java.util.stream.Stream;

public class FactorialCalculatingMain {

	public static void main(String[] args) {
		int z;
		System.out.println("Enter The Number For Calculating Factorial");
		z = new Scanner(System.in).nextInt();
		Stream<Integer> stream = Stream.iterate(1, x -> x + 1).limit(z);
		int result = stream.reduce(1, (a, e) -> a * e);
		System.out.println("Factorial of : " + z + " is : " + result);
	}

}

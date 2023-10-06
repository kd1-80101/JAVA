import java.util.Iterator;

public class PrintTriangle {

	public static void main(String[] args) {
		int row = 5;
		for (int i = 1; i <= row; i++) 
		{
			for (int j = 1; j <= row-i; j++) 
			{
				System.out.print(" ");
			}
			for (int z = 1; z <= i; z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

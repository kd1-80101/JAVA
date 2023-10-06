import java.util.Scanner;

public class Hotel {

	public static int displayMenu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("_____________________");
		System.out.println("ENTER THE CHOICE");
		System.out.println("0.EXIT");
		System.out.println("1.Butter Chicken        $300");
		System.out.println("2.Chicken Tikka Masala  $400");
		System.out.println("3.Paneer Tikka          $200");
		System.out.println("4.Biryani               $300");
		System.out.println("5.Samosa                $10");
		System.out.println("6.Aloo Gobi             $20");
		System.out.println("7.Dosa                  $50");
		System.out.println("8.Paneer Roll           $80");
		System.out.println("9.Paneer 65             $100");
		System.out.println("10.Generate Bill");
		System.out.println("_____________________");
		choice = sc.nextInt();
		return choice;

	}

	public static void main(String[] args) {
		int choice;

		Scanner sc = new Scanner(System.in);
		double amount = 0;
		int quantity;

		do {
			choice = displayMenu();
			System.out.println(choice);
			switch (choice) {
			case 1: {
				System.out.println("Please Enter Butter Chicken Quantity");
				quantity = sc.nextInt();
				amount = amount + (quantity * 300);
				break;
			}
			case 2: {
				System.out.println("Please Enter Chicken Tikka Masala Quantity");
				quantity = sc.nextInt();
				amount = amount + (quantity * 400);
			}
				break;
			case 3: {
				System.out.println("Please Enter Paneer Tikka Quantity");
				quantity = sc.nextInt();
				amount = amount + (quantity * 200);
			}
				break;
			case 4: {
				System.out.println("Please Enter Biryani Quantity");
				quantity = sc.nextInt();
				amount = amount + (quantity * 300);
			}
				break;
			case 5: {
				System.out.println("Please Enter Samosa Quantity");
				quantity = sc.nextInt();
				amount = amount + (quantity * 10);
			}
				break;
			case 6: {
				System.out.println("Please Enter Aloo Gobi Quantity");
				quantity = sc.nextInt();
				amount = amount + (quantity * 20);
			}
				break;
			case 7: {
				System.out.println("Please Enter Dosa Quantity");
				quantity = sc.nextInt();
				amount = amount + (quantity * 50);
			}
				break;
			case 8: {
				System.out.println("Please Enter Paneer Roll Quantity");
				quantity = sc.nextInt();
				amount = amount + (quantity * 80);
			}
				break;
			case 9:

			{
				System.out.println("Please Enter Paneer 65 Quantity");
				quantity = sc.nextInt();
				amount = amount + (quantity * 100);
			}
				break;

			case 10:
				System.out.println("YOUR TOTAL BILL : " + amount);
				break;

			case 0:
				System.out.println("THANKS FOR VISITING... ");
				break;

			}

		} while (choice != 0);

	}

}

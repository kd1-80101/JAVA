import java.util.Scanner;

public class Invoice {
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	double amount;

	Scanner sc = new Scanner(System.in);

	public double getAmount() {
		return amount=quantity*price;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Invoice(String partNumber, String partDescription, int quantity, double price, double amount) {

		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
		this.amount = amount;

	}

	public Invoice() {
		this("", "", 0, 0, 0);
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	void acceptData() {
		double amt = 0;
		int qty = 0;
		System.out.println("ENTER THE PART DETAILS :");
		System.out.println("ENTER THE PART NUMBER :");
		this.partNumber = sc.nextLine();
		System.out.println("ENTER THE PART DESCRIPTION:");
		this.partDescription = sc.nextLine();

		{
			System.out.println("Enter the quantity :");
			if (sc.hasNextInt())
				qty = sc.nextInt();
			if (qty > 0)
				this.quantity = qty;
			else
				this.quantity = 0;
		}

		{
			System.out.println("Enter the price :");
			if (sc.hasNextDouble())
				amt = sc.nextDouble();
			if (amt > 0)
				this.price = amt;
			else
				this.price = 0;
		}
	}

	void calculateBill() {
		acceptData();
		System.out.println("PART NUMBER :" + this.getPartNumber());
		System.out.println("PART DESCRIPTION :" + this.getPartDescription());
		System.out.println("BILL AMOUNT :" + quantity * price);
	}

	public static void main(String[] args) {
		Invoice i = new Invoice();
		//i.calculateBill();

	}

}








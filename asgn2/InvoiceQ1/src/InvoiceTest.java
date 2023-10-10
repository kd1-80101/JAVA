
public class InvoiceTest {
	public static void main(String[] args) {
		// Create an Invoice object
		Invoice invoice = new Invoice("079849618", "MICROPROCESSOR M1 4050Ti GEN 2", 5, 1299.99, 11);

		// Display invoice details
		System.out.println("Part Number: " + invoice.getPartNumber());
		System.out.println("Part Description: " + invoice.getPartDescription());
		System.out.println("Quantity: " + invoice.getQuantity());
		System.out.println("Price Per Item: $" + invoice.getPrice());

		// Calculate and display the invoice amount
		double invoiceAmount = invoice.getAmount();
		System.out.println("Invoice Amount: $" + invoiceAmount);
	}
}

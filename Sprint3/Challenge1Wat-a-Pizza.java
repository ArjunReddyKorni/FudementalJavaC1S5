import java.util.Scanner;
class PizzaOrder{
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		String customerName = scanner.nextLine();
		String customerEmail = scanner.nextLine();
		//scanner.nextLine();
		long phoneNo = scanner.nextLong();
		scanner.nextLine();
		String address = scanner.nextLine();
		/*int noOfPizzasOrdered = scanner.nextInt();
		double priceOfPizza = scanner.nextDouble();
		char pizzaSize = scanner.nextChar();
		int noOfGarlicBread = scanner.nextInt();
		double priceOfGarlicBread = scanner.nextDouble();
		int noOfBeveragesOrdered = scannerInt();*/
		System.out.println("sl No\t\t Category");
		System.out.println("----------------------");
		System.out.println("1) Pizza");
		System.out.println("2) Garlic Bread");
		System.out.println("3) Beverages");
		System.out.println("Enter 1 for pizza, 2 for GarlicBread, 3 for Beverages");
		int choice = scanner.nextInt();
		System.out.println("Please enter the number of pizza you want to order :");
		int quantity = scanner.nextInt();
			switch(choice){
				case 1:
						double pizzaBill = 12.99 * quantity;
						System.out.println("Your total Pizza Bill : $"+ pizzaBill);
						break;
				case 2:
						double garlicBreadBill = 5.99 * quantity;
					System.out.println("Your total Garlic Bread Bill : $"+ garlicBreadBill);
					break;
				case 3:
						float beverageBill = 1.99f * quantity;
						System.out.println("Your total Beverage Bill : $"+ beverageBill);
						break;
				

			}

	}
}
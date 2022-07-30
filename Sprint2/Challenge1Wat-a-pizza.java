class PizzaOrder{
	public static void main(String[] args){
	String customerName = "Grey";
	String customerEmail = "gary@123.com";
	long phoneNo = 412312345L;
	String address = "20,Marble Drive,Eville";
	int noOfPizzasOrdered = 5;
	float pizzaPrice = 12.5f;
	char pizzaSize = 'M';
	int noOfGarlicBreadOrdered = 3;
	float garlicBreadPrice = 5.99f;
	int noOfBeveragesOrdered =3;
	float beveragePrice = 1.99f;

	float totalPriceOfPizzas = noOfPizzasOrdered * pizzaPrice;
	float totalPriceOfGarlicBread = noOfGarlicBreadOrdered * garlicBreadPrice;
	float totalPriceOfBeverages = noOfBeveragesOrdered * beveragePrice; 
	float totalBill = totalPriceOfBeverages+totalPriceOfGarlicBread+totalPriceOfPizzas;
	 boolean flag = totalBill >= 100;
	 float discount = 10/totalBill * 100;

		
		System.out.println("---------------------------------------");
		System.out.println("	     Customer Details		");
		System.out.println("---------------------------------------");
		System.out.println("Customer Name	:" + customerName);
		System.out.println("Email		:" + customerEmail);
		System.out.println("PnoneNumber	:" + phoneNo);
		System.out.println("DeliveryAddress	:" + address);
		System.out.println("---------------------------------------");
		System.out.println("		Order Details		");
		System.out.println("---------------------------------------");
		System.out.println("Sr no.	ItemNames	ItemQuantity	$Price/Unit	$TotalPrice");
		System.out.println("------------------------------------------------------------------");
		System.out.println("1	Pizza		"+noOfPizzasOrdered+"	"+"	"+pizzaPrice+"		"+totalPriceOfPizzas);
		System.out.println("2	Garlic Bread	"+noOfBeveragesOrdered+"	"+"	"+garlicBreadPrice+"		"+totalPriceOfGarlicBread);
		System.out.println("3	Beverages	"+noOfBeveragesOrdered+"	"+"	"+beveragePrice+"		"+totalPriceOfBeverages);
		System.out.println("------------------------------------------------------------------");
		System.out.println("Total Bill Amount:" + "$" + totalBill);
		System.out.println("Discount Offered : 10%");
		System.out.println("Amount to be paid:" + "$" + discount);
		System.out.println("---------------------------Thank You------------------------------");
	}
}
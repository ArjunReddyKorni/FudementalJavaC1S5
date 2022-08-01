import java.util.Scanner;

class PizzaOrder {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//System.out.println("Please enter your name, email, phonen No, address");
		String customerName = scanner.nextLine();
		String email = scanner.nextLine();
		String address = scanner.nextLine();
		long phoneNum = scanner.nextLong();
	     PizzaOrder object = new PizzaOrder();
	
		float pizzaPrice = 12.99f;
		
		float garlicBreadPrice = 5.99f;
		
		float beveragePrice = 1.99f;
		object.displayCustomerDetails(customerName, email, phoneNum, address);
		object.displayMenu();
		

		float finalBeveragePrice  = 0;
		float finalGarlicBreadPrice = 0;
		float finalPizzaPrice = 0;
		int noOfPizzaOrdered = 0;
		int noOfGarlicBreadOrdered = 0 ;
		int noOfBeverageOrdered = 0 ;

		boolean continueorder = false;

		do {

		//System.out.println("Enter 1 for Pizza , 2 for Garlic Bread and 3 for Beverage");
		
		int userChoice = scanner.nextInt();

		switch (userChoice) {
			case 1:


			//System.out.println("Please enter the size of pizza ");
				
			int pizzaSize = scanner.nextInt();      	
				//System.out.println("Please enter number of pizza you want to order");
				 noOfPizzaOrdered = scanner.nextInt();	
				 finalPizzaPrice =  noOfPizzaOrdered * object.getPriceBasedOnTheSizeOfThePizza(pizzaSize);
				//System.out.println("Final Pizza price "+ finalPizzaPrice);
				break;
			case 2:

				//System.out.println("Please enter number of Garlic Bread you want to order");
					
				 noOfGarlicBreadOrdered = scanner.nextInt();	
				 finalGarlicBreadPrice =  noOfGarlicBreadOrdered * object.getPricefGarlicBread();
				//System.out.println("Final Garlic Bread price "+ finalGarlicBreadPrice);

				break;

			case 3:
			//System.out.println("Please enter number of Beverage you want to order");
					
			 noOfBeverageOrdered= scanner.nextInt();	
			 finalBeveragePrice =  noOfBeverageOrdered * object.getPriceOfBeverage();
			//System.out.println("Final Beverage price "+ finalBeveragePrice);

				break;

			default:
			System.out.println("Invaid Choice");
				break;

				
		}

			
		//System.out.println("Do you want to place another order, enter 1 to continue , 0 to exit ");
		int userContinueOption = scanner.nextInt();

		if (userContinueOption == 1) {
			continueorder = true;
		} else {
			continueorder = false;
		}
		

		} while (continueorder); //loop


		// Print order details
		System.out.println("---------------------------------------------");
		System.out.println("Order Details");
		System.out.println("--------------");
		System.out.println("The number of pizzas ordered       : " + noOfPizzaOrdered);
		System.out.println("The number of garlic bread ordered : " + noOfGarlicBreadOrdered);
		System.out.println("The number of beverages ordered    : " + noOfBeverageOrdered);
		System.out.println("-------------------------------------------------");

		float finalTotal = finalPizzaPrice + finalBeveragePrice + finalGarlicBreadPrice;
		System.out.println("The Total Bill Amount is      : $"+ finalTotal);

		Boolean IsOrderMoreThan50= false;

		if (finalTotal > 50) {
			IsOrderMoreThan50 = true;
		} 


		int discountPercent = 0;

		if (IsOrderMoreThan50) {
			discountPercent =  10;
			//System.out.println("Discount % "+ discountPercent);

		float discountedFinalAmount = finalTotal - ( finalTotal *(discountPercent / 100f));
		System.out.println("The Discounted Bill Amount is : $"+ discountedFinalAmount);
		}else{
			System.out.println("No Discount on Bill");
		}

		



	} // End of main

	public void displayCustomerDetails(String name, String email, long phoneNo, String address){

		
		System.out.println("Customer Details");
		System.out.println("-----------------");
		System.out.println("Name of the Customer is : " + name );
		System.out.println("Email of the Customer is : " + email);
		System.out.println("Contact No of the Customer is : " + phoneNo);
		System.out.println("Address of the Customer is : " + address);


		// System.out.println("Name - "+ name);
		// System.out.println("email - "+ email);
		// System.out.println("phoneNo - "+ phoneNo);
		// System.out.println("address - "+ address);

	} // end of displayCustomerDetails

	public void displayMenu(){
	 /*	System.out.println("Select the item to order ");
		System.out.println("sl no Item Category \n --------------------------");
		System.out.println("1) Pizza");
		System.out.println("\t Price of one regular pizza : $9.99");	
		System.out.println("\t Price of one medium pizza : $11.99");	
		System.out.println("\t Price of one large pizza : $13.99");	
		System.out.println("2) Garlic Bread");
		System.out.println("\t Price of one Garlic Bread : $5.99");	
		System.out.println("3) Beverage");
		System.out.println("\t Price of one Beverage : $1.99");	
		//System.out.println("Enter 1 for Pizza , 2 for Garlic Bread and 3 for Beverage");*/
	
	} //end of function

	public float getPriceBasedOnTheSizeOfThePizza (int size){
		float priceOfpizza = 0;
		 if (size== 1) {
			priceOfpizza =9.99f;
		

			
		 } else  if (size== 2) {
			priceOfpizza =11.99f;
			
		 } else  if (size== 3) {
			priceOfpizza =13.99f;
			
		 } else {
			System.out.println("Invaild Choice, Enter 1,2 or 3");
			
		 } 
		 return priceOfpizza;
	}// end of function
	public  float getPricefGarlicBread(){
		return 5.99f;
	}

	public  float getPriceOfBeverage() {
		return 1.99f;
	}



}
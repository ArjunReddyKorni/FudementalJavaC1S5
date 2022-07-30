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
		
		int repeat = 1;
		float pizzaBill = 0;
		float garlicBreadBill = 0;
		float beverageBill = 0;
		while(repeat == 1){
		//System.out.println("sl No\t\t\t Category");
		//System.out.println("----------------------");
		//System.out.println("1) Pizza");
		//System.out.println("2) Garlic Bread");
		//System.out.println("3) Beverages");
		//System.out.println("Enter 1 for pizza, 2 for GarlicBread, 3 for Beverages");
		 int choice = scanner.nextInt();
		 int totalQuantity = 0;
		 int quantity =0;
		 
		 
			switch(choice){
				case 1:
						quantity = scanner.nextInt();
						totalQuantity = totalQuantity + quantity;
						pizzaBill = 12.99f * totalQuantity;
						repeat  = scanner.nextInt();
						break;
				case 2:
					quantity = scanner.nextInt();
					totalQuantity = totalQuantity + quantity;
					garlicBreadBill = 5.99f * totalQuantity;
					repeat  = scanner.nextInt();
					      break;
				case 3:
							quantity = scanner.nextInt();
						totalQuantity = totalQuantity + quantity;
						beverageBill = 1.99f * totalQuantity;
						repeat  = scanner.nextInt();
						  break;
				default :
						System.out.println();
						repeat = scanner.nextInt(); 
						
						

			}	
			float totalBill = pizzaBill + garlicBreadBill + beverageBill;
		}

		float totalBill = pizzaBill + garlicBreadBill + beverageBill;
		System.out.println("The total bill amount : $ " + totalBill);
		
	if(totalBill > 50){
		float discountedTotalBill = (totalBill - (10*totalBill)/100);
		System.out.println("The total discounted bill amount : $ " + discountedTotalBill);
	}
	else{
		System.out.println("No discount provided since bill amount is less than $ 50");
	}
		
	}
}
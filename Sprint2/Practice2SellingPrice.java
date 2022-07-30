class SellingPrice{
	public static void main(String[] args){

	String itemName = "Kaisa Bowl";
	double sellingPrice = 10.99;
	double discount = 5;
  //Incresed the selling price by 5%
	double revisedSellingPrice = sellingPrice + (sellingPrice/100*discount);
	
	System.out.println("Revised Selling price for " + itemName + " is $" + revisedSellingPrice);
   }
}
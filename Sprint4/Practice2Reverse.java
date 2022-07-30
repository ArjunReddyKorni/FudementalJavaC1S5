import java.util.Scanner;
class ReverseDigit1{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
 	System.out.println("Enter a Number");
	int number = scanner.nextInt();
	int reverse = 0;
	int digit = 0;
	if(number < 0){
		System.out.println("Input number cannot be negative");
	}
		else if(number == 0){
			System.out.println("Input number cannot be zero");
		}
		else 
           while(number !=0){
    	    digit = number % 10;
	        reverse = reverse * 10 + digit;
	        number= number / 10;
 	       }
			System.out.println("The reverse of the given number is: "+ reverse);
			//System.out.println("Number cannot be zero");
		//}
		//System.out.println("Input number cannot be zero");
	
	//System.out.println("The reverse of the given number is: "+ reverse);
	//System.out.println("Input number cannot be negative");
	}
}
import java.util.Scanner;
class EvenOddSum{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
		int number = scanner.nextInt();
		int sumOfOdd =0;
		int sumOfEven =0;
  		if(number < 0) {
			  System.out.print("Input number cannot be negative");
		  }
			 else if(number == 0){
				 System.out.println("Input number cannot be zero");
			 }
			 else{
		        while(number !=0){
			     int digit = number % 10;
			     number = number/10;
			
			       if(digit % 2 != 0){
				    sumOfOdd = sumOfOdd + digit;
			        }
			
			          if(digit % 2 == 0){
				         sumOfEven = sumOfEven + digit;
			          }
				}
		 		System.out.println("Sum of even numbers = " + sumOfEven);
				 System.out.println("Sum of odd numbers = " + sumOfOdd);
			 }
   }

}
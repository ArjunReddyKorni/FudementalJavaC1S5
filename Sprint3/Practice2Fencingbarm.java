import java.util.Scanner;
class AreaCalculator{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("For calculating sqaure =1");
        System.out.println("For calculating circle =2");
        System.out.println("For calculating rectangle =3");

	int shape = scanner.nextInt();
	
	switch(shape){
		case 1:
			System.out.println("Enter side of Sqaure");
			double side = scanner.nextDouble();
			   side=side*side;
			System.out.println("Area of square fence for chickens is :"+side);
			break;
		case 2:
	 		System.out.println("Enter radius of circle");
			double radius = scanner.nextDouble();
				radius= 3.141*radius*radius;
			System.out.println("Area of circular fence for ducks is :"+radius);
			break;		
		case 3:
			System.out.println("Enter length");
			double length = scanner.nextDouble();
			System.out.println("Enter width");
			double width = scanner.nextDouble();
			double area = length*width;
			System.out.println("Area of rectangular fence for cows is :"+area);
			break;	
			}
	}
}
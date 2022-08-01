import java.util.Scanner;
class AreaCalculator{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter side");
		double side = scanner.nextDouble();
		System.out.println("enter radius");
		double radius = scanner.nextDouble();
		System.out.println("enter length&width");
		double length = scanner.nextDouble();
		double width = scanner.nextDouble();
		AreaCalculator object = new AreaCalculator();
		double areaOfSquare = object.calculateAreaOfSquare(side);
		double areaOfCircle = object.calculateAreaOfCircle(radius);
		double areaOfRectangle = object.calculateAreaOfRectangle(length,width);
		System.out.println("area of rectangle"+areaOfRectangle);
		System.out.println("arae of circle"+areaOfCircle);
		System.out.println("area of square"+areaOfSquare);
	}
	public double calculateAreaOfSquare(double side){
        double areaOfSquare = side * side;
		return areaOfSquare;
	}
	public double calculateAreaOfCircle(double radius){
		double areaOfCircle = 3.14 * radius * radius;
		return areaOfCircle;
	}
	public double calculateAreaOfRectangle(double length,double width){
		double areaOfRectangle = length * width;
		return areaOfRectangle;
	}
}
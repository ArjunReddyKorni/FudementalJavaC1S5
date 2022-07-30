import java.util.Scanner;
class PhLevelAnalyser{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	//System.out.println("Enter ph value between 0-14");
	int phValue = scanner.nextInt();
 	if(phValue < 7)
		System.out.println("pH value is low, partial water change required.");
	else if(phValue >=7 && phValue <=8)
		System.out.println("pH value is fine");
	else if(phValue >8)
		System.out.println("pH value is high,partial water change required");
	   
	}
}

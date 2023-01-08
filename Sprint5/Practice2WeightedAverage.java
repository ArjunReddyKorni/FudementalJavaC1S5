import java.util.Scanner;
class WeightAverage{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	    int assignmentWeight = scanner.nextInt();
		int projectWeight = scanner.nextInt();
		int quizWeight = scanner.nextInt();
		int midTermWeight =scanner.nextInt();
		int finalExamWeight =scanner.nextInt();
	System.out.println("Enter assignmentScore");
	float assignmentScore = scanner.nextFloat();
	System.out.println("Enter projectScore");
	float projectScore = scanner.nextFloat();
	System.out.println("Enter quizScore");
	float quizScore = scanner.nextFloat();
	System.out.println("Enter midTeamScore");
	float midTermScore = scanner.nextFloat();
	System.out.println("Enter finalExamScore");
	float finalExamScore = scanner.nextFloat();

	WeightAverage object = new WeightAverage();

	float result = object.calculateWeightedAverage(assignmentScore,projectScore,quizScore,midTermScore,finalExamScore,assignmentWeight,projectWeight,quizWeight,midTermWeight,finalExamWeight);
	System.out.println("The weighted average score is " + result + "%");

	}
	public float calculateWeightedAverage(float assignmentScore,float projectScore,float quizScore,float midTermScore,float finalExamScore ,int assignmentWeight,int projectWeight,int quizWeight,int midTermWeight,int finalExamWeight){
		//Scanner scanner = new Scanner(System.in);
		/*int assignmentWeight = scanner.nextInt();
		int projectWeight = scanner.nextInt();
		int quizWeight = scanner.nextInt();
		int midTermWeight =scanner.nextInt();
		int finalExamWeight =scanner.nextInt();*/
		System.out.println("Weights  % Value of score");
	float assignmentPercentageScore = (assignmentWeight/100.0f)*assignmentScore;
	System.out.println("Assignments "+assignmentPercentageScore);
	float projectPercentageScore = (projectWeight/100.0f)*projectScore;
	System.out.println("Projects "+projectPercentageScore);
	float quizPercentageScore = (quizWeight/100.0f)*quizScore;
	System.out.println("Quizzes "+quizPercentageScore);
	float midTermPercentageScore = (midTermWeight/100.0f)*midTermScore;
	System.out.println("Mid term "+midTermPercentageScore);
	float finalExamPercentageScore = (finalExamWeight/100.0f)*finalExamScore;
	System.out.println("Final Exam "+finalExamPercentageScore);
		
		float overallPercentage = assignmentPercentageScore + projectPercentageScore + quizPercentageScore + midTermPercentageScore+finalExamPercentageScore;
     	return overallPercentage;
	}

}
import java.util.Random;
import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		double [] grades = new double[10];
		//int random = new Random().nextInt(grades.length);
		//int randomNum = grades[random];
		System.out.println("Your grades for this semester are: ");
		for(int i=0;i<grades.length;i++) {
			grades[i]= new Random().nextInt(100);
			System.out.println(grades[i]);
		}
		int sum = 0;
		for(int i=0;i<grades.length;i++) {
			sum+=grades[i];
		}
		double average = sum/grades.length;
		System.out.println("Your average is "+ average);
		
		//System.out.println(randomNum);
		if(average<50) {
			System.out.println("You are not going to college anymore");
		}
		else if(average>=50&&average<=60) {
			System.out.println("Dad is grounding you oh no he's going to take you out of Rutgers");
		}
		else if(average>=60&&average<=70) {
			System.out.println("Not good enough Dad only wants A's");
			
		}
		else if(average>70&&average<=80) {
			System.out.println("Stil not good enough, he will still yell at you");
		}
		else if(average>80&&average<=90) {
			System.out.println("Okay not that bad");
		}
		else if(average>90) {
			System.out.println("Good job you finally satisfied Dad's standards");
		}
		
		
		
	
}
}

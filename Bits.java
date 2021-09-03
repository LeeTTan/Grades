import java.util.Scanner;

public class Bits {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Input a number to check how many times it can divide by 2 until the answer is less than 1:  ");
		 int n = in.nextInt();
		 if(n<0) {
			 System.out.print("Illegal input");
			 System.exit(0);
		 }
		 int count=0;
		 while(n>=1){ 
			n/=2;
			count++;
		 }
		System.out.print(count);
		
	 }

}

import java.util.Scanner;
	public class CompareDigits {
		public static void main(String[] args){
			
		int userNum1;
		int userNum2;
		int i;
		final int INITIAL_SUM;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		userNum1 = scnr.nextInt();
		System.out.println("Enter a second number with the same amount of digits: ");
		userNum2 = scnr.nextInt();
		
		INITIAL_SUM =(userNum1 % 10) + (userNum2 % 10);
		i = INITIAL_SUM;
		
		while (i == INITIAL_SUM) {
			userNum1 = userNum1 / 10;
			userNum2 = userNum2 / 10;
			i = (userNum1 % 10) + (userNum2 % 10);
			
		}
			
		if (userNum1 == 0) {
			System.out.println("True");
		} else {
			System.out.println("False"); 
			}
		
		}
	}
		
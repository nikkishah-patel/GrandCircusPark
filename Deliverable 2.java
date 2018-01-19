import java.util.Scanner;
public class DateCalculator {
	public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
			
			int firstDay;
			int secondDay;
			int firstMonth;
			int secondMonth;
			int firstYear;
			int secondYear;
			
			System.out.println("Please enter first dates information: ");
			System.out.println("Enter a day of the month (1-31).");
			firstDay = scnr.nextInt();
			System.out.println("Enter a month (1-12).");
			firstMonth = scnr.nextInt();
			System.out.println("Enter the year (yyyy).");
			firstYear = scnr.nextInt();
			
			System.out.println("Please enter the second dates information: ");
			System.out.println("Enter a day of the month.");
			secondDay = scnr.nextInt();
			System.out.println("Enter a month (1-12).");
			secondMonth = scnr.nextInt();
			System.out.println("Enter the year (yyyy).");
			secondYear = scnr.nextInt();
			
			System.out.println("The difference in dates are: " + Math.abs(secondDay - firstDay) + " days. The difference in the months are: "  + Math.abs(secondMonth-firstMonth) +  " months. The difference in the years are: "  + Math.abs(secondYear-firstYear) + " years.");
			
			
			
			
			
			
			
			
		
			

}


}

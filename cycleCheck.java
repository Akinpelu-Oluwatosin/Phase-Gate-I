import java.util.Scanner;

	public class cycleCheck{

	public static void main(String...args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("1: TO KNOW YOUR SAFE PERIOD");

	System.out.println("2: TO KNOW YOUR OVULATION DATES");

	System.out.println("3: TO KNOW YOUR FLOW DATE");

	System.out.println("4: TO EXIT");
	 
	System.out.print("SELECT AN OPTION: ");
	
	int userOption = input.nextInt();
	
	if(userOption == 1){

	safePeriod(8);

}

	else if(userOption == 2) {

	ovulationDates();
}
	else if(userOption == 3) {

	flowDate();

}
	else if(userOption == 4) {

            System.out.println("GOODBYE");

           

}
	else {

            System.out.println("Invalid option .");

        }

	
}

	public static void safePeriod(int thedate){
	
	Scanner input = new Scanner(System.in);

	System.out.print("What day of your cycle are you?: ");
	
	int date = input.nextInt();
	
	int safeDate = 28;
	
	if(date < safeDate){

	System.out.println("You are likely to get pregnant this period");
}
	else{
	System.out.println("You're free to have unprotected sex");
}
}


	public static void ovulationDates() {

	Scanner input = new Scanner(System.in);

        System.out.print("Enter the first date of your last period : ");

        int startDate = input.nextInt();

        int ovulationStart = startDate + 11; 

        int ovulationEnd = startDate + 16;

        System.out.println("Your ovulation window is likely between day " + ovulationStart + " and day " + ovulationEnd + " of your cycle.");

        System.out.println("Avoid unprotected sex this period.");

}



	public static void flowDate() {

	Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of your cycle e.g. 28days: ");

        int cycleLength = input.nextInt();

        System.out.print("Enter the first day of your last period in numbers: ");

        int lastPeriodStart = input.nextInt();

        int nextFlowStart = lastPeriodStart + cycleLength;

        if (nextFlowStart > 31) {

	nextFlowStart = nextFlowStart % 31; 
}

        System.out.println("Your next monthly flow date is  around day " + nextFlowStart + " of the month.");

}



}
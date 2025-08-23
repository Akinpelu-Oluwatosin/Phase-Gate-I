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
}
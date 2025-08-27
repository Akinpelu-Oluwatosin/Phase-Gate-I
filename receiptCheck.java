import java.util.Scanner;
	
	public class receiptCheck{
	public static void main(String...args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("What's your name?");
	String custumerName = input.nextLine();


	System.out.println("What did you buy?");
	String goods = input.nextLine();
	
	System.out.println("How many pieces did you buy?");
	String theQuantity = input.nextLine();

	System.out.println("Price of the first good?");
	int firstPrice = input.nextInt();
	
	System.out.println("Price of the second good?");
	int secondPrice = input.nextInt();

	System.out.println("Do you still want want to shop?");
	String response = input.nextLine();

	System.out.println("SEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, Herbert Maculay way , Sabo Yaba , Lagos\nTel: 09034323432\nDate : 27-08-2025  12:08 pm\nCashier Name\nCustumer's name "  + custumerName);
	
	
	System.out.println("======================================================================================");


	System.out.println("           ITEM	QYT	PRICE	  TOTAL(NGN)");

}

}
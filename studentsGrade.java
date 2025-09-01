import java.util.Scanner;

	public class studentsGrade{
	
		public static void main(String... args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students do you have?: ");
		int studentsAmount = input.nextInt();
	
		System.out.println("How many subjects?: ");
		int studentsSubject = input.nextInt();

		int[][] scoresAndSubjects = new int[studentsAmount][studentsSubject];	
	
		for(int students = 0; students <= studentsAmount; students++){
		System.out.println("student" + (students + 1) + ":");
} 
		for(int index = 0; index <= studentsAmount.length; index++){
		System.out.println("Input the students subjects" + (students + 1) + ":" + studentsAmount[students]);
		String studentsName = input.nextLine();
}
}

}
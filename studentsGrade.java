import java.util.Scanner;

	public class studentsGrade{
	
		public static void main(String... args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students do you have?: ");
		int studentsAmount = input.nextInt();
	
		System.out.println("How many subjects?: ");
		int studentsSubjectAmount = input.nextInt();

		int[][] scoresAndSubjects = new int[studentsAmount][studentsSubject];	
		String[] studentNames = new String[studentsAmount];
		System.out.println("Enter the student's name");

		for(int students = 0; students <= studentsAmount; students++){
		System.out.println("student" + (students + 1) + ":");
} 
		for(int subject = 0; subject <= studentsAmount.length; subject++){
		System.out.println("Input the students subjects" + (students + 1) + ":" + studentsAmount[students]);
		String studentsName = input.nextLine();
}
}                  

}
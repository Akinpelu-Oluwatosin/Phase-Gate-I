import java.util.Scanner;

public class studentsGrade {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many students do you have?: ");
        int studentsAmount = input.nextInt();

        System.out.println("How many subjects?: ");

        int studentsSubjectAmount = input.nextInt();

        int[][] scoresAndSubjects = new int[studentsAmount][studentsSubjectAmount];

        String[] studentNames = new String[studentsAmount];

        double[] averageScores = new double[studentsAmount];

        String[] remarks = new String[studentsAmount];

        input.nextLine(); // consume the leftover newline

      
        for (int students = 0; students < studentsAmount; students++) {

            System.out.print("Enter student name " + (students + 1) + ": ");

            studentNames[students] = input.nextLine();
}

        for (int students = 0; students < studentsAmount; students++) {

            System.out.println("Entering scores for " + studentNames[students] + ":");

            int total = 0;

            for (int subject = 0; subject < studentsSubjectAmount; subject++) {


                System.out.print("Enter score for subject " + (subject + 1) + ": ");

                int score = input.nextInt();

                scoresAndSubjects[students][subject] = score;

                total += score;
}

            double average = (double) total / studentsSubjectAmount;

            averageScores[students] = average;

           
            if (average >= 90) {

                remarks[students] = "Excellent";

} 
		else if (average >= 70) {

                remarks[students] = "Very Good";

} 
		else if (average >= 50) {

                remarks[students] = "Good";

} 
		else if (average >= 40) {

                remarks[students] = "Fair";

} 
		else {

                remarks[students] = "Poor";
}
}

        
        System.out.println("Student Report:");

        for (int students = 0; students < studentsAmount; students++) {

            System.out.print("Name: " + studentNames[students] + " | Scores: ");

            for (int subject = 0; subject < studentsSubjectAmount; subject++) {

                System.out.print(scoresAndSubjects[students][subject] + " ");

}
            
}

       
}
}
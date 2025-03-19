import java.util.Scanner;

public class GradeCalculator{
    
    public static int getStudentScore(Scanner input){
        int score=-1;

        while(!input.hasNextInt()){
            System.out.println("Invalid input. Please try again.");
            input.next();
            System.out.println("Enter your score (0-100): ");
        }

        score = input.nextInt();

        while (score<0||score>100) {
            System.out.println("Invalid input. Score must be only between 0 to 100.");
            System.out.println("Enter your score (0-100): ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please try again.");
                input.next();
                System.out.println("Enter your score (0-100): ");
            }

            score = input.nextInt();
        }

        return score;
    }
    public static char calculateGrade(int score){
        if(score >= 90){
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = getStudentScore(input);
        char grade = calculateGrade(score);
        System.out.println("Your grade is "+grade);

        input.close();
    }
}

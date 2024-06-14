import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained (out of 100) in each subject for Grade evaluation
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // For Calculate Total Marks
        int totalMarks = calculateTotalMarks(marks);

        // For Calculate Average Percentage
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);

        // ForGrade Calculation
        char grade = calculateGrade(averagePercentage);

        // To Display Results
        displayResults(totalMarks, averagePercentage, grade);

        scanner.close();
    }

    private static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }
     // According to my university grading

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 91)
        {
            return 'O';
        } 
        else if (averagePercentage >= 81)
        {
            return 'A';
        }
        else if (averagePercentage >= 71) 
        {
            return 'B';
        }
        else if (averagePercentage >= 61) 
        {
            return 'C';
        } 
        else if (averagePercentage >= 55)
        {
            return 'D';
        }
        else if (averagePercentage >= 50)
        {
            return 'E';
        }
        else {
            return 'F';
        }
    }

    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}


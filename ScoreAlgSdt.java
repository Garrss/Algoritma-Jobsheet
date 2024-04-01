import java.util.Scanner;

public class ScoreAlgSdt {
    String nameSdt;
    int scoreAssgnments, scoreQuiz, scoreMid, scoreFinal;

    double CalculateTotalScore(int ass, int quiz, int mid, int finals) {
        return (ass * 0.3) + (quiz * 0.2) + (mid * 0.2) + (finals * 0.3);
    }

    static double averageScoreBF(ScoreAlgSdt[] students) {
        double totalScore = 0;
        for (ScoreAlgSdt student : students) {
            totalScore += student.CalculateTotalScore(student.scoreAssgnments, student.scoreQuiz, student.scoreMid,
                    student.scoreFinal);
        }
        return totalScore / students.length;

    }

    static double averageScoreDC(ScoreAlgSdt[] students, int start, int end) {
        if (start == end) {
            return students[start].CalculateTotalScore(students[start].scoreAssgnments, students[start].scoreQuiz,
                    students[start].scoreMid, students[start].scoreFinal);
        } else {
            int mid = (start + end) / 2;
            double leftScore = averageScoreDC(students, start, mid);
            double rightScore = averageScoreDC(students, mid + 1, end);
            int totalStudents = (end - start) + 1;
            return ((leftScore * (mid - start + 1)) + (rightScore * (end - mid))) / totalStudents;
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many students do you want to enter? ");
        int numStudents = sc.nextInt();
        ScoreAlgSdt[] students = new ScoreAlgSdt[numStudents];

        for (int i = 0; i < students.length; i++) {
            students[i] = new ScoreAlgSdt();
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i].nameSdt = sc.next();
            System.out.print("Enter the score of assignments: ");
            students[i].scoreAssgnments = sc.nextInt();
            System.out.print("Enter the score of quiz: ");
            students[i].scoreQuiz = sc.nextInt();
            System.out.print("Enter the score of mid-term: ");
            students[i].scoreMid = sc.nextInt();
            System.out.print("Enter the score of final: ");
            students[i].scoreFinal = sc.nextInt();
        }

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-10s | %10s%n ", students[i].nameSdt,
                    students[i].CalculateTotalScore(students[i].scoreAssgnments, students[i].scoreQuiz,
                            students[i].scoreMid, students[i].scoreFinal));
        }

        System.out.printf("%-10s | %10s%n ", "Average BF", averageScoreBF(students));
        System.out.printf("%-10s | %10s%n ", "Average DC", averageScoreDC(students, 0, students.length - 1));
    }

}

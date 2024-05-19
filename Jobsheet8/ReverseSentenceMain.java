import java.util.Scanner;

public class ReverseSentenceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Sentence: ");
        String sentence = scanner.nextLine();

        ReverseSentence reverse = new ReverseSentence();
        String reversedSentence = reverse.reverseSentence(sentence);

        System.out.println("Result: ");
        System.out.println(reversedSentence);

        scanner.close();
    }
}

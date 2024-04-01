import java.util.Scanner;

public class Assignment2 {
    public static String countVotes(String[] votes, int start, int end) {
        if (start == end) {
            // System.out.println("Start: " + votes[start]);
            return votes[start];
        } else {
            int mid = start + (end - start) / 2;
            // System.out.println("mid: " + mid);
            String leftCandidates = countVotes(votes, start, mid);
            String rightCandidates = countVotes(votes, mid + 1, end);
            // System.out.println("left candidates: " + leftCandidates);
            // System.out.println("right candidates: " + rightCandidates);

            if (leftCandidates.equals(rightCandidates)) {
                // System.out.println("left candidates akhir: " + leftCandidates);
                return leftCandidates;
            } else {
                int leftCount = countVotesHelper(votes, leftCandidates, start, end);
                int rightCount = countVotesHelper(votes, rightCandidates, start, end);
                // System.out.println("left count: " + leftCount);
                // System.out.println("right count: " + rightCount);
                if (leftCount > rightCount) {
                    // System.out.println("candidate left: " + leftCandidates);
                    return leftCandidates;
                } else if (rightCount > leftCount) {
                    // System.out.println("candidate right: " + rightCandidates);
                    return rightCandidates;
                } else {
                    return "m";
                }

            }
        }
    }

    public static int countVotesHelper(String[] votes, String candidate, int start, int end) {
        int count = 0;
        // System.out.println("start: " + start);
        // System.out.println("end: " + end);
        for (int i = start; i <= end; i++) {
            if (votes[i].equals(candidate)) {
                count++;
            }
        }

        return count;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many votes there are: ");
        int numVotes = sc.nextInt();

        String[] votes = new String[numVotes];

        for (int i = 0; i < votes.length; i++) {
            System.out.println("Vote " + (i + 1) + ": ");
            votes[i] = sc.next();
        }

        // String votes[] = {"A", "B", "A", "C", "B", "A", "A"};
        // // String votes[] = {"A", "B", "B", "A"};

        String highestCandidate = countVotes(votes, 0, votes.length - 1);

        if (highestCandidate.equals("m")) {
            System.out.println("Multiple candidates have the same highest votes");
        } else {
            System.out.println("The candidate with the highest votes is: " + highestCandidate);
        }
    }
}

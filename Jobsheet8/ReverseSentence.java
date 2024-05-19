import java.util.Stack;

public class ReverseSentence {

    public String reverseSentence(String sentence) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reversed = new StringBuilder();

        // Push each character of the sentence onto the stack
        for (char c : sentence.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack to form the reversed sentence
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}

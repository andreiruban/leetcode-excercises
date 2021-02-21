import java.util.Arrays;
import java.util.Stack;

public class PolishNotationCalc {

    private static final Stack<Integer> SEQ_STACK = new Stack<>();

    public static String[] handle(String[] seq) {
        for (String operand : seq) {
            if ("+".equals(operand))
                add();
            else if ("-".equals(operand))
                subtract();
            else if ("*".equals(operand))
                multiply();
            else
                SEQ_STACK.push(Integer.parseInt(operand));
        }

        String[] res = Arrays.stream(SEQ_STACK.toArray())
                .map(String::valueOf)
                .toArray(String[]::new);

        SEQ_STACK.clear();
        return res;
    }

    private static void add() {
        int b = SEQ_STACK.pop();
        int a = SEQ_STACK.pop();
        SEQ_STACK.push(a + b);
    }

    private static void subtract() {
        int b = SEQ_STACK.pop();
        int a = SEQ_STACK.pop();
        SEQ_STACK.push(a - b);
    }

    private static void multiply() {
        int b = SEQ_STACK.pop();
        int a = SEQ_STACK.pop();
        SEQ_STACK.push(a * b);
    }

    public static void main(String[] args) {
        String[] seq1 = new String[]{"1", "3", "+"};
        String[] seq2 = new String[]{"8", "3", "-"};
        String[] seq3 = new String[]{"6", "7", "*"};

        System.out.println(Arrays.toString(handle(seq1)));
        System.out.println(Arrays.toString(handle(seq2)));
        System.out.println(Arrays.toString(handle(seq3)));
    }
}

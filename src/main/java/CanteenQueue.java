import java.util.Stack;

public class CanteenQueue {

    private final Stack<Integer> in = new Stack<>();
    private final Stack<Integer> out = new Stack<>();

    public String registerCommand(String command) {
        String[] data = command.split(" ");
        if ("*".equals(data[0])) {
            int employee = Integer.parseInt(data[1]);
            int initSize = in.size();
            int position = in.size() % 2 == 0 ? initSize / 2 - 1 : initSize / 2;

            for (int i = 0; i < position; i++) {
                out.push(in.pop());
            }

            out.push(employee);

            for (int i = 0; i < initSize - position; i++) {
                out.push(in.pop());
            }

            return "Registered";
        } else if ("+".equals(data[0])) {
            int number = Integer.parseInt(data[1]);
            in.push(number);
            return "Registered";
        } else if ("-".equals(data[0])) {
            if (out.isEmpty()) {
                return "Queue is empty";
            } else {
                return String.valueOf(out.pop());
            }
        } else {
            return "Unknown command";
        }
    }

    public static void main(String[] args) {
        CanteenQueue queue = new CanteenQueue();
        for (int i = 1; i < 10; i++) {
            System.out.println(queue.registerCommand("+ " + i));
        }

        System.out.println(queue.registerCommand("* " + 100));

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.registerCommand("-"));
        }
    }
}

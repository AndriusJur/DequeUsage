import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        Deque<String> stack=new ArrayDeque<>();//not multithreaded

        stack.push("first req");
        stack.push("second req");
        stack.push("third req");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
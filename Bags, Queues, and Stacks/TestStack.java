public class TestStack {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>();
        myStack.push("Hello");
        myStack.push("why");
        myStack.push("okay");

        for (String s:myStack)
            System.out.println(myStack.pop());
    }
}

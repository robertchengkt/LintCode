public class MinStack {
    private Stack<Intege> stack;
    private Stack<Intege> miniStack;
 
    public MinStack() {
        // do initialize if necessary
        stack = new Stack<Integer>();
        miniStack = new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
        if (miniStack.isEmpty()){
            miniStack.push(number);
        } else {
            miniStack.push(Math.min(number, miniStack.peek()));
        }
    }

    public int pop() {
        // write your code here
        miniStack.pop();
        return stack.pop();
    }

    public int min() {
        // write your code here
        return miniStack.peek();
    }
}
package DataStructures.maxStack;

public class TestMaxStack {
    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(1);
        maxStack.printStack();
        maxStack.push(2);
        maxStack.printStack();
        maxStack.pop();
        maxStack.printStack();
        maxStack.push(3);
        maxStack.printStack();
    }


}

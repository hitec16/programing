package DataStructures.maxStack;

public class MaxStack {

    private Node stack;
    private Node max;

    private static class Node {
        private int val;
        private Node next;
        private Node oldMax;

        Node(int val) {
            this.val = val;
        }
    }

    public void push(int x) {
        Node n = new Node(x);

        if (stack == null) {
            stack = n;
            max = n;
        } else {
            n.next = stack;
            stack = n;
        }
        if (max != null && max.val < n.val) {
            n.oldMax = max;
            max = n;
        }
    }

    public int pop() {
        if (stack == null) throw new RuntimeException("Stack is Empty");
        Node n = stack;
        stack = stack.next;
        if (n.oldMax != null) {
            max = n.oldMax;
        }
        return n.val;
    }

    public int getMax() {
        if (max == null) throw new RuntimeException("Stack is empty");
        return max.val;
    }

    public void printStack(){
        Node node = stack;
        while (node != null){
            System.out.print(node.val +" -> ");
            node = node.next;
        }
        System.out.println("Max val is :" + getMax());
    }
}

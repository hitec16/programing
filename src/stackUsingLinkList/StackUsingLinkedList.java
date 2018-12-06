package stackUsingLinkList;

import java.util.LinkedList;

public class StackUsingLinkedList {

    private LinkedList<Node> mLinkedList;
    private Node firstNode = null;

//    public StackUsingLinkedList() {
//        mLinkedList = new LinkedList<>();
//    }

    public void push(String item) {
        Node temp = firstNode;

        firstNode = new Node();
        firstNode.message = item;
        firstNode.next = temp;
    }

    public String pop() {
        String item = firstNode.message;
        firstNode = firstNode.next;
        return item;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public int size() {
        int size = 0;
        if (isEmpty()) {
            return 0;
        }

        while (firstNode.next != null) {
            size++;
        }
        return size;
    }


    private class Node {
        String message;
        Node next;
    }
}

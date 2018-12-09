package stackUsingLinkList;

import java.util.Iterator;

public class StackUsingLinkedList<Item> implements Iterable<Item> {

    private Node firstNode = null;

//    public StackUsingLinkedList() {
//        mLinkedList = new LinkedList<>();
//    }

    public void push(Item item) {
        Node temp = firstNode;

        firstNode = new Node();
        firstNode.item = item;
        firstNode.next = temp;
    }

    public Item pop() {
        Item item = firstNode.item;
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

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = firstNode;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Item item;
        Node next;
    }
}

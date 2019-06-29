package CodingInterviewBook.linkedList;

public class DetectLoopInLinkedList {

    public static void main(String[] args) {

        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        //Linked list with a loop
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        if (detectLoopInLinkedList(head)) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop");
        }

    }

    static boolean detectLoopInLinkedList(Node head) {
        Node ptr1 = head;//slow
        Node ptr2 = head;//fast

        boolean loop = false;

        while (ptr1 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if (ptr1 == ptr2) {
                loop = true;
                removeLoopFromLinkedList(ptr1, head);
                break;
            }
        }
        return loop;
    }

    static void removeLoopFromLinkedList(Node loop, Node head) {
        Node ptr2;
        Node ptr1 = head;

        while(true) {
            ptr2 = loop;
            //condition1: complete circle of loop
            //condition2:
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }

            // if there is a loop then break while loop
            if(ptr2.next == ptr1){
                break;
            }
            /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
            ptr1 = ptr1.next;
        }

        ptr2.next = null;
    }
}

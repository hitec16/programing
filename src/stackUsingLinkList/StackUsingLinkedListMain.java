package stackUsingLinkList;

public class StackUsingLinkedListMain {

    public static void main(String[] args) {
        StackUsingLinkedList mystack = new StackUsingLinkedList();
        mystack.push("Hitesh1");
        mystack.push("Hitesh2");
        System.out.println(mystack.pop());
        mystack.push("Hitesh3");
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());

        System.out.println("IsEmpty now : " + mystack.isEmpty());
    }
}

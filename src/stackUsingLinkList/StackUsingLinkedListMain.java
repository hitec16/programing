package stackUsingLinkList;

import java.util.LinkedList;

public class StackUsingLinkedListMain {

    public static void main(String[] args) {
        StackUsingLinkedList<String> mystack = new StackUsingLinkedList<String>();
        mystack.push("Hitesh1");
        mystack.push("Hitesh2");
        System.out.println(mystack.pop());
        mystack.push("Hitesh3");
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());

        System.out.println("IsEmpty now : " + mystack.isEmpty());

//        for (String s : mystack){
//            System.out.println("Iterator " + s);
//        }
    }
}

package CodingInterviewBook.ArraysAndString;

/*Implement an algorithm to determine if a string has all unique characters.*/

public class isUnique {

    public static void main(String[] args) {

        String msg = "abcdefghijk";
        if(isTheStringUnique(msg)){
            System.out.println("Yes, unique string");
        }
        else {
            System.out.println("Not unique string");
        }

    }

    private static boolean isTheStringUnique(String msg) {
        if (msg.length() > 128) {
            return false;
        }
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < msg.length(); i++) {
            int val = msg.charAt(i);
            if (charSet[val]) {
                // character repeat hence not unique string
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }

}

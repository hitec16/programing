package CodingInterviewBook.ArraysAndString;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        String s = "abcd";
        permutations("", s, result);
        for (String perm : result) {
            System.out.println(perm);
        }
    }

    private static void permutations(String prefix, String suffix, List<String> result) {
        if (suffix.isEmpty()) {
            result.add(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                permutations(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1, suffix.length()), result);
            }
        }
    }
}

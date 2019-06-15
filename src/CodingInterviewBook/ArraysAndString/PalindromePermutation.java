package CodingInterviewBook.ArraysAndString;

public class PalindromePermutation {
    // check if a string is a permutation of a palindrome.
    public static void main(String[] args) {

        System.out.println("panlindrome permutation : " +isPermutationOfPalindrome("AAbCC"));
    }

    public static boolean isPermutationOfPalindrome(String str){

        int[] arr = buildCharFrequencyArray(str);

        return checkMaxOneOdd(arr);

    }

    private static boolean checkMaxOneOdd(int[] arr){
        boolean foundOdd = false;
        for(int count: arr){
            if(count % 2 == 1){
             if(foundOdd){
                 return false;
             }
             foundOdd = true;
            }
        }
        return true;
    }

    private static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(val <= z && val >= a){
            return val - a;
        }
        return -1;
    }

    private static int[] buildCharFrequencyArray(String str){
        int[] arr = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c: str.toCharArray()){
            int x = getCharNumber(c);
            if(x != -1){
                arr[x]++;
            }
        }
        return arr;
    }

}

import java.util.Arrays;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        boolean anagramCheck = areAnagrams(s1, s2);
        System.out.println(s1 + " and " + s2 + " are anagrams? " + anagramCheck);
    }
}

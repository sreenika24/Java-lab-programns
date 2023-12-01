public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    
    public static void main(String[] args) {
        String input = "madam";
        boolean isPal = isPalindrome(input);
        System.out.println("Is Palindrome? " + isPal);
    }
}

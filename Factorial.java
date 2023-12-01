public class Factorial {
    public static int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    
    public static void main(String[] args) {
        int num = 5;
        int factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}

public class Fibonacci {
    public static void generateFibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    
    public static void main(String[] args) {
        int terms = 10;
        generateFibonacci(terms);
    }
}

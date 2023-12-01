public class PrimeCheck {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int number = 17;
        boolean isPrimeNum = isPrime(number);
        System.out.println(number + " is Prime? " + isPrimeNum);
    }
}

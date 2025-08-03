public class PrimeChecker {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();
        System.out.println("Prime numbers between 1 and 500:");

        for (int i = 1; i <= 500; i++) {
            if (checker.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

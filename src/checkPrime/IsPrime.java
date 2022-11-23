package checkPrime;

public class IsPrime {
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime();
        System.out.println(isPrime.checkNumberPrime(23));
    }

    public boolean checkNumberPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number < 4) {
            return true;
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

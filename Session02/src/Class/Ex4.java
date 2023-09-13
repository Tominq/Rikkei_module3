package Class;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là: ");
        int count = 0;
        int num = 2;
        while (count < 20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

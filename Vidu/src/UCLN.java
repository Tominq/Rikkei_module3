import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lon: ");
        int num1 = scanner.nextInt();
        System.out.println("nhập số nhỏ: ");
        int num2 = scanner.nextInt();

        int ucln = timUCLN(num1, num2);
        System.out.println(+ucln);
    }

    public static int timUCLN(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
    }
}

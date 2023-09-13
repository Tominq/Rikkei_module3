package Class;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị đầu: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhập giá trị cuối: ");
        int num2 = scanner.nextInt();
        int sum = 0;
        for (int i = num1; i <= num2; i += 2) {
            sum += i;
        }
        System.out.println("Tổng các số chẵn là: " + sum);
    }
}

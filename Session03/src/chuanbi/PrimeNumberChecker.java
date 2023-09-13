package chuanbi;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        int divisor = 2;

        while (divisor <= Math.sqrt(number)) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
            divisor++;
        }

        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không phải là số nguyên tố.");
        }

        scanner.close();
    }
}
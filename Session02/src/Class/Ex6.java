package Class;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu app: ");
            System.out.println("1. Kiểm tra tính chẵn lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số chia hết cho 3 khum ");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn của bạn ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkEvenOdd();
                    break;
                case 2:
                    checkPrime();
                    break;
                case 3:
                    checkDivisibleBy3();
                    break;
                case 4:
                    System.out.println("Kết thúc");
                    return;
                default:
                    System.out.println("Mời nhập lại");
            }
        }
    }

    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }
    }

    public static void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kt: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            System.out.println("số ko hợp lệ");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Số nguyên tố");
        } else {
            System.out.println("Khum là số nguy6en tố");
        }
    }

    public static void checkDivisibleBy3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kt: ");
        int num = scanner.nextInt();
        if (num % 3 == 0) {
            System.out.println("Chia hết cho 3");
        } else {
            System.out.println("Khum chia hết cho 3");
        }
    }
}

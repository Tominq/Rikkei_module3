package Home;

import java.util.Scanner;

public class MonthDayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng(1-12): ");
        int month = scanner.nextInt();

        int days;

        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        System.out.println("Số ngày trong tháng: " + month + " là: " + days);
    }
}

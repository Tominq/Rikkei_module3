package Home;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cân nặng(kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Nhập chiều cao: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * weight);
        System.out.println("BMI của bạn là: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Phân loại: Gầy");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("hơi béo");
        } else {
            System.out.println("mập");
        }
    }
}

package home;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double height = scanner.nextDouble();

        double area = width * height;

        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }
}
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double length = scanner.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.println("Diện tích: " +width*length);
        System.out.println("chu vi: " +2*(width+length));
    }
}

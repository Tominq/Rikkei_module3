import java.util.Scanner;

public class While_vidu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Nhập 1 số từ bàn phím: ");
            int x = Integer.parseInt(scanner.nextLine());
            sum += x;
            if (x == 0) {
                break;
            }
        }
        System.out.println("Sum là: " + sum);
    }
}

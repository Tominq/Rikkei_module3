package Class;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Enter ur name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("hello " + name);
    }
}

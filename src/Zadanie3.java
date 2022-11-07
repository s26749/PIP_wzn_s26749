import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println("X, Y after swapping: " + "x = " + x + " y = " + y);
    }
}

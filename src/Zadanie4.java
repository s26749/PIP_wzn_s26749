import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("X, Y after swapping: " + "x = " + x + " y = " + y);

    }

}


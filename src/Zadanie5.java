import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        simpleMethod();


    }

    private static void simpleMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: " );
        int x = scanner.nextInt();
        int y = String.valueOf(x).chars().map(Character::getNumericValue).sum();
        System.out.println(y);

    }
}

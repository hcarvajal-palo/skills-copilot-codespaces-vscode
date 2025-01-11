import java.util.Scanner;

public class SumProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int number1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println("La suma de " + number1 + " y " + number2 + " es: " + sum);
    }
}
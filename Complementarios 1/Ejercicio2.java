import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("Ingrese dos números enteros: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num + "+" + num2 + "=" + suma(num, num2));
        System.out.println(num + "-" + num2 + "=" + resta(num, num2));
        System.out.println(num + "*" + num2 + "=" + multiplicacion(num, num2));
        System.out.println(num + "/" + num2 + "=" + division(num, num2));
        scan.close();
    }

    public static int suma (int a, int b) {
        return a + b;
    }
    public static int resta (int a, int b) {
        return a - b;
    }
    public static int multiplicacion (int a, int b) {
        return a * b;
    }
    public static int division (int a, int b) {
        return a / b;
    }
    
}

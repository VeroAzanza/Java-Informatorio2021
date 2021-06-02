import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        System.out.println("Ingrese dos numeros enteros: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.print(num + " elevado a " + num2 + " = " + potencia(num,num2));
        scan.close();

    }

    public static int potencia(int a, int b) {

        int pot = 1;
        for (int i = 1; i <= b; i++) {
            pot *= a;
        }
        return pot;
    }
}
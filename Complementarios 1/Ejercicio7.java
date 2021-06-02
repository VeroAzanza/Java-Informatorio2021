import java.util.*;

public class Ejercicio7 { 

    public static void main(String[] args) {
        
        System.out.println("Ingrese una palabra: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        System.out.print(mayuscula(palabra));
        scan.close();
    }

    public static String mayuscula(String p) {

        String resultado = "";
        for(int i = 0; i < p.length(); i++) {
            Character caracter = p.charAt(i);
            if(caracter >= 'a' && caracter <= 'z') {
                caracter = (char)(caracter - 'a' + 'A');
                caracter.toString();
                resultado = resultado + caracter;
            }
        }
        return resultado;
    }
}
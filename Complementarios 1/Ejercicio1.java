import java.util.*;

public class Ejercicio1 {


    public static void main(String[] args) {

        System.out.println("Ingrese su nombre de usuario por favor: ");
        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();
        imprimirUsuario(usuario);
        scan.close();
    
    }

    public static void imprimirUsuario(String a) {

        System.out.println("Hola! " + a);
        
    }
}
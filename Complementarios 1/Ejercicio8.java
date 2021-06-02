
import java.util.*; 

public class Ejercicio8 {


    public static void main(String[] args) {
        
        System.out.println("Ingrese su NOMBRE Y APELLIDO, EDAD, DIRECCION Y CIUDAD por favor: ");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        String edad = scan.nextLine();
        String direccion = scan.nextLine();
        String ciudad = scan.nextLine();
        List<String> objeto = new ArrayList<>();
        persona(nombre,edad,direccion,ciudad,objeto);
        System.out.print(objeto.get(0) + " - " + objeto.get(1) + " - " + objeto.get(2) + " - " + objeto.get(3));
        scan.close();
        
    }
    public static List<String> persona(String c, String d, String e, String n, List<String> o) {
        o.add(c);
        o.add(d);
        o.add(e);
        o.add(n);
        return o;
    }
    
}

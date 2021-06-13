package Ejercicio5;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {
    
    public static void main(String[] args) throws IOException {

        //muestro la lista de Empleados 
        ServiciosEmpleados.mostrarLista(crearObjetos());

        //Solicito una letra para mostrar los empleados con apellidos empezados por esa misma
        System.out.print("Ingrese letra de apellido para mostrar Empleados: ");
        Scanner scan = new Scanner(System.in);
        String letra = scan.nextLine();
        ServiciosEmpleados.mostrarEmpleadosApellido(crearObjetos(), letra);
        scan.close();

        //Empleado que más y el que menos gana
        ServiciosEmpleados.SueldoMayorMenor(crearObjetos());

        //Edad del empleado más joven y del más viejo
        ServiciosEmpleados.empleadoJovenViejo(crearObjetos());

        
    }

    public static List<Empleados> crearObjetos() throws IOException {
        List<Empleados> lista = new ArrayList<>();
        try(BufferedReader archivo = new BufferedReader(new FileReader("E:/VERO/INFORMATORIO/Java/empleados.txt"))) {
        String empleado = archivo.readLine();
        while(empleado != null) {
            var separador = empleado.split(",");
            Empleados persona = new Empleados(separador[0], separador[1], separador[2], separador[3]);
            lista.add(persona);
            empleado = archivo.readLine();
        }
        return lista;
        }
    }
}

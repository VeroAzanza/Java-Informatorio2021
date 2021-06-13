package Ejercicio5;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ServiciosEmpleados {


    public static void mostrarLista(List<Empleados> lista) {
        for(int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getNombre() + " ");
            System.out.print(lista.get(i).getApellido() + " ");
            System.out.print(lista.get(i).getFecha() + " ");
            System.out.println(lista.get(i).getSueldo() + " ");
        }
    }

    public static void mostrarEmpleadosApellido(List<Empleados> lista, String a) {

        String mayuscula = a.toUpperCase();
        char caracter = mayuscula.charAt(0);
        System.out.println("Empleados con apellidos que comienzan en " + a);
        for(int i = 0; i < lista.size(); i++) {
            String apellido = lista.get(i).getApellido();
            if (apellido.charAt(0) == caracter) {
                System.out.print(lista.get(i).getNombre() + " ");
                System.out.print(lista.get(i).getApellido() + " ");
                System.out.print(lista.get(i).getFecha() + " ");
                System.out.println(lista.get(i).getSueldo() + " ");
            }
        }
    }

    public static void empleadoJovenViejo(List<Empleados> lista) {

        LocalDate hoy = LocalDate.now();
        List<Integer> edades = new ArrayList<>();
        for(Empleados empleado : lista) {

            LocalDate nacimiento = convertirStringALocalDate(empleado);
            Period edadEmpleado = Period.between(hoy, nacimiento);
            int años = edadEmpleado.getYears();
            edades.add(años);
        }
        Collections.sort(edades);
        int menor = edades.get(0);
        int mayor = edades.get(edades.size() - 1);

        System.out.println("El empleado más joven tiene: " + -(menor) + " años");
        System.out.println("El empleado mayor tiene: " + -(mayor) + " años");
    }

    public static void SueldoMayorMenor(List<Empleados> lista) {
        
        List<Integer> salarios = new ArrayList<>();
        for(Empleados empleado : lista) {
            int s = convertirSueldoEnEntero(empleado);
            salarios.add(s);
        }
        Collections.sort(salarios);
        int menor = salarios.get(0);
        int mayor = salarios.get(salarios.size() - 1);
        for(Empleados empleado : lista) {
            if(convertirSueldoEnEntero(empleado) == menor) {
                System.out.println("El empleado que gana menos es: " + empleado.getNombre() + " " + empleado.getApellido() + " $" + menor);
            }
            else if(convertirSueldoEnEntero(empleado) == mayor) {
                System.out.println("El empleado que gana más es: " + empleado.getNombre() + " " + empleado.getApellido() + " $" + mayor);
            }
        }
    }

    public static LocalDate convertirStringALocalDate(Empleados p){

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaEmpleado = LocalDate.parse(p.getFecha(), formatoFecha);
        return fechaEmpleado;
    }

    public static int convertirSueldoEnEntero(Empleados p) {
        int sueldoConvertido = Integer.valueOf(p.getSueldo());
        return sueldoConvertido;
    }
}

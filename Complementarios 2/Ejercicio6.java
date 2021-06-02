import java.util.*;

public class Ejercicio6 {

    
    public static void main(String[] args) {
        
        Empleado p1 = new Empleado("Veronica Azanza",40501459,125,250);
        Empleado p2 = new Empleado("Matias Kisiel",36019450,130,300);
        Empleado p3 = new Empleado("Azanza Agustina",41354932,110,200);
        Empleado p4 = new Empleado("Malgieri Cristina",21351150,100,250);
        p1.agregarEmpleados();
        p2.agregarEmpleados();
        p3.agregarEmpleados();
        p4.agregarEmpleados();


    }

public class Persona {

    String nombreyApellido;
    int dni;

    public Persona(String nombreyApellido, int dni) {
        this.nombreyApellido = nombreyApellido;
        this.dni = dni;
        
    }

}
public class Empleado extends Persona {

    private int horasTrabajadas;
    private int valorPorHora;
    private Map<Integer, Integer> s = new HashMap<>();
    private Set<String> lista = new HashSet<>();

    public Empleado(String nombreyApellido, int dni, int horasTrabajadas, int valorPorHora) {
        super(nombreyApellido,dni);
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;

    }

    public void agregarEmpleados() {
        lista.add(this.nombreyApellido);
        lista.add(String.valueOf(this.dni));
        lista.add(String.valueOf(this.horasTrabajadas));
        lista.add(String.valueOf(this.valorPorHora));
    }

    public int calcularSueldo() {

        return this.horasTrabajadas * this.valorPorHora;
    }


    public void sueldoPersona(int dni, int sueldo) {

        s.put(this.dni,sueldo);

    }
}
}
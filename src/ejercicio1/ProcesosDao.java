package ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class ProcesosDao {
    private static ArrayList<Empleado> empleados;

    ProcesosDao(){
        empleados = new ArrayList<>();
    }

    public static void saveEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public static void VisualizarInformacion(Empleado empleado) {
        String info = "Nombre: " + empleado.getNombre() + "\n"
                + "Apellido: " + empleado.getApellido() + "\n"
                + "Genero: " + empleado.getGenero() + "\n"
                + "Fecha de Nacimiento: " + empleado.getFechaNacimiento() + "\n"
                + "Fecha de Ingreso: " + empleado.getFechaIngreso() + "\n"
                + "Salario Basico: " + empleado.getSalarioBasico();
        System.out.println(info);
    }

    public void ModificarSalario(Empleado empleado, double nuevoSalario) {
        empleado.setSalarioBasico(nuevoSalario);
    }

    public int calcularEdad(Empleado empleado) {
        LocalDate ahora = LocalDate.now();
        Date fechaNacimiento = empleado.getFechaNacimiento();
        LocalDate fechaNac = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(fechaNac, ahora).getYears();
    }

    public int calcularAntiguedad(Empleado empleado) {
        LocalDate ahora = LocalDate.now();
        Date fechaIngreso = empleado.getFechaIngreso();
        LocalDate fechaIng = fechaIngreso.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(fechaIng, ahora).getYears();
    }

    public double calcularPrestaciones(Empleado empleado) {
        int antiguedad = calcularAntiguedad(empleado);
        double salarioBasico = empleado.getSalarioBasico();
        return (antiguedad * salarioBasico) / 12;
    }
    public void visualizarInformacion(Empleado empleado) {
        System.out.println(empleado.toString());
    }

    public void modificarSalario(Empleado empleado, double nuevoSalario) {
        empleado.setSalarioBasico(nuevoSalario);
        System.out.println("Salario modificado exitosamente");
    }
}

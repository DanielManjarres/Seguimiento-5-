package ejercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ProcesosDao empleadoDAO = new ProcesosDao();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fecha de nacimiento del empleado (dd/MM/yyyy): ");
        Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());

        System.out.print("Ingrese la fecha de ingreso del empleado (dd/MM/yyyy): ");
        Date fechaIngreso = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());

        System.out.print("Ingrese el salario básico del empleado: ");
        double salarioBasico = Double.parseDouble(scanner.nextLine());

        Empleado empleado = new Empleado("Juan", "Perez", "Masculino", fechaNacimiento, fechaIngreso, salarioBasico);

        ProcesosDao.saveEmpleado(empleado);

        String[] opciones = {"Visualizar información", "Modificar salario", "Calcular edad", "Calcular antigüedad", "Calcular prestaciones", "Salir del programa"};
        while (true) {
            System.out.println("Seleccione una opción:");
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    ProcesosDao.visualizarInformacion(empleado);
                    break;
                case 2:
                    System.out.print("Ingrese el nuevo salario del empleado: ");
                    double nuevoSalario = Double.parseDouble(scanner.nextLine());
                    empleadoDAO.modificarSalario(empleado, nuevoSalario);
                    break;
                case 3:
                    System.out.println("La edad del empleado es: " + empleadoDAO.calcularEdad(empleado));
                    break;
                case 4:
                    System.out.println("La antigüedad del empleado es: " + empleadoDAO.calcularAntiguedad(empleado));
                    break;
                case 5:
                    System.out.println("Las prestaciones del empleado son: " + empleadoDAO.calcularPrestaciones(empleado));
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

package ejercicio5;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Turno> listaTurnos = new ArrayList<>();

        listaTurnos.add(new Turno(JOptionPane.showInputDialog(null,"Hora de inicio en la mañana:"), JOptionPane.showInputDialog(null,"Hora fin en la mañana"), "Turno de mañana"));
        listaTurnos.add(new Turno(JOptionPane.showInputDialog(null,"Hora de inicio en la tarde"),JOptionPane.showInputDialog(null,"Hora fin en la tarde"), "Turno de tarde"));

        for (Turno turno : listaTurnos) {
            System.out.println("Hora de inicio: " + turno.getHoraInicio());
            System.out.println("Hora de fin: " + turno.getHoraFin());
            System.out.println("Descripción: " + turno.toString());
            System.out.println();
        }
    }

}

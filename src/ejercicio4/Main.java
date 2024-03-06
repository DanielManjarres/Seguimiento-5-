package ejercicio4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario("Mazda","Armenia Quindio, Carrera 15 calle 4", 200);
        System.out.println(concesionario.getInfo());

        concesionario.agregarCarro();

        System.out.println(concesionario.getInfo());

        if (concesionario.venderCarro(20)) {
            System.out.println("Se han vendido 20 carros del concesionario.");
        } else {
            System.out.println("No se pudieron vender 20 carros del concesionario.");
        }
        System.out.println("Información del concesionario"+"\n"+concesionario.getInfo());
    }
}

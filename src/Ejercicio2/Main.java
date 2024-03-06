package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ProcesoDao procesoDao = new ProcesoDao();
        String[] opciones = {"Ver saldos","Consignar Cuenta Ahorros","Retirar Cuenta Ahorros","Consignar Cuenta Corriente","Retirar Cuenta Corriente","Invertir en CDT","Cerrar CDT","Salir"};
        boolean flag = true;
        do{
            int options = JOptionPane.showOptionDialog(null, "Seleccione la opcion", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            switch (options){
                case 0:
                    procesoDao.verSaldo();
                    break;
                case 1:
                    procesoDao.ingresoAhorros();
                    break;
                case 2:
                    procesoDao.retiroAhorros();
                    break;
                case 3:
                    procesoDao.ingresoCorriente();
                    break;
                case 4:
                    procesoDao.retiroCorriente();
                    break;
                case 5:
                    procesoDao.ingresoCDT();
                    break;
                case 6:
                    procesoDao.cerrarCDT();
                    break;
                case 7:
                    flag = false;
                    break;
            }
        }while (flag);
    }
}

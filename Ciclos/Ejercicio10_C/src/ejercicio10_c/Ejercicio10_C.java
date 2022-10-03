package ejercicio10_c;

import javax.swing.JOptionPane;

    /*
    Pedir 10 numeros y escribir la suma total.
    */
// @author Emili
public class Ejercicio10_C {

    public static void main(String[] args) {
        int suma=0, numero;
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            suma += numero;
        }
    JOptionPane.showMessageDialog(null, "La suma total es: "+suma);
    }
}

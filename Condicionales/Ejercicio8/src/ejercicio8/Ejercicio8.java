package ejercicio8;

import javax.swing.JOptionPane;

    /*
    Pedir un numero entre 0 y 99.999 y decir cuantas cifras tiene.
    */
// @author Emili
public class Ejercicio8 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 99.999: "));
        
        if (numero<10) {
            JOptionPane.showMessageDialog(null, "El numero tiene una cifras");
        }
        else if (numero<100) {
            JOptionPane.showMessageDialog(null, "El numero tiene dos cifras");
        }
        else if (numero<1000) {
            JOptionPane.showMessageDialog(null, "El numero tiene tres cifras");
        }
        else if (numero<10000) {
            JOptionPane.showMessageDialog(null, "El numero tiene cuatro cifras");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero tiene cinco cifras");
        }
    }
}

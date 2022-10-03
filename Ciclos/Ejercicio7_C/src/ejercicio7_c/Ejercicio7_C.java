package ejercicio7_c;

import javax.swing.JOptionPane;

    /*
    Pedir numeros hasta que se introduzca uno negativo, y calcular la media.
    */
// @author Emili
public class Ejercicio7_C {

    public static void main(String[] args) {
        int numero, acumulador=0;
        float media=0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introducir un numero"));
        while (numero>0) {
            acumulador++;
            media += numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introducir un numero"));
        }
        if (acumulador==0) {
            System.out.println("Error, la division entre o no existe");
        }else{
            media /= acumulador;
            JOptionPane.showMessageDialog(null, "La media es: "+media);
        }
        
    }
}

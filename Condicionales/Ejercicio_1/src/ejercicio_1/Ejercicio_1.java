package ejercicio_1;

import javax.swing.JOptionPane;

    /*
    Hacer un programa que lea un número entero y muestre si el número
    es múltiplo de 10.
    */
// @author Emili
public class Ejercicio_1 {

    public static void main(String[] args) {
        int numero;

        numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        if(numero%10==0){
            JOptionPane.showMessageDialog(null, "El número es múltiplo");
        }else{
            JOptionPane.showMessageDialog(null, "No es múltiplo");
        }
    }
}

package ejercicio7;

import javax.swing.JOptionPane;

    /*
    Pedir tres numeros y mostrarlos ordenados de mayor a menor.
    */
// @author Emili
public class Ejercicio7 {

    public static void main(String[] args) {
        int numero1, numero2, numero3;
        
        numero1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero3= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
 
        if ((numero1>numero2)&&(numero2>numero3)) {
            JOptionPane.showMessageDialog(null, "Los numeros son: "+numero1+"-"+numero2+"-"+numero3);
        } 
        else if ((numero1>numero3)&&(numero3>numero3)) {
            JOptionPane.showMessageDialog(null, "Los numeros son: "+numero1+"-"+numero3+"-"+numero2);
        }
        else if ((numero2>numero1) && (numero1>numero3)) {
            JOptionPane.showMessageDialog(null, "Los numeros son: "+numero2+"-"+numero1+"-"+numero3);
        }
        else if ((numero2>numero3) && (numero3>numero1)) {
            JOptionPane.showMessageDialog(null, "Los numeros son: "+numero2+"-"+numero3+"-"+numero1);
        }
        else if ((numero3>numero1) && (numero1>numero2)) {
            JOptionPane.showMessageDialog(null, "Los numeros son: "+numero3+"-"+numero1+"-"+numero2);
        }
        else {
            JOptionPane.showMessageDialog(null, "Los numeros son: "+numero3+"-"+numero2+"-"+numero1);
        }
    }
}

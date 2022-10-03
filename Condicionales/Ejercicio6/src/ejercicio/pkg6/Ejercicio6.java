package ejercicio.pkg6;

import javax.swing.JOptionPane;

    /*
    Hacer un programa que tome dos numero y diga si ambos son pares o impares
    */
// @author Emili
public class Ejercicio6 {

    public static void main(String[] args) {
        int a, b;
        
        a=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        
        if ((a%2==0) && (b%2==0)) {
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
        } else if ((a%2 != 0) && (b%2 !=0 )) {
            JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
        }else {
            JOptionPane.showMessageDialog(null, "Un numero es par y el otro impar");
        }
        }
    }


package ejercicio1;

import javax.swing.JOptionPane;

    /*
    Leer un número y mostrar su cuadrado, repetir el proceso hasta que
    se introduzca un número negativo.
    */
// @author Emili
public class Ejercicio1 {

    public static void main(String[] args) {
        int numero, cuadrado;
	
	numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        while(numero>=0){
	cuadrado= (int)Math.pow(numero,2);
	
	JOptionPane.showMessageDialog(null, "El numero”+numero+”elevado al cuadrado es"+cuadrado);
	
	numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        }
    }
}


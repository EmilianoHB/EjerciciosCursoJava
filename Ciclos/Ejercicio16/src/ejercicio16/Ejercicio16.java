package ejercicio16;

import javax.swing.JOptionPane;

    /*
    Pide un número (que debe estar entre 0 y 10) y muestra la tabla
    de multiplicar de dicho número.
    */
// @author Emili
public class Ejercicio16 {

    public static void main(String[] args) {
        int numero;
	
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del 1 al 10"));
        }while(numero<0 || numero>10);

        for(int i=1; i<=10; i++){
            System.out.println(numero+" * "+i+" = "+numero*i);
        }
    }
}

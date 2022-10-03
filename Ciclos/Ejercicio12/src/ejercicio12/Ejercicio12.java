package ejercicio12;

import javax.swing.JOptionPane;

    /*
    Pedir un número y calcular su factorial
    */
// @author Emili
public class Ejercicio12 {

    public static void main(String[] args) {
        int numero;
	long factorial=1;
	
	numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
	
	for(int i=1; i<=numero; i++){
            factorial *= i;
        }
        System.out.println("EL factorial es:"+factorial);
    }
}

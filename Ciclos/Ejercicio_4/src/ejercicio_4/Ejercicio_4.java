package ejercicio_4;

import javax.swing.JOptionPane;

    /*
    Pedir un número hasta que se teclee uno negativo, y mostrar cuántos
    numeros se han introducido.
    */
// @author Emili
public class Ejercicio_4 {

    public static void main(String[] args) {
        int numero, acumulador=0;
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
	
	while(numero>=0){
	acumulador++;
	numero = Integer.parseInt (JOptionPane.showInputDialog("Digite un número: "));
        }
        System.out.println("Se han digitado "+acumulador+" numeros");
    }
}

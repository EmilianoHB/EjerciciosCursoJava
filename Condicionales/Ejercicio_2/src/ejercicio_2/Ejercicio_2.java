package ejercicio_2;

import javax.swing.JOptionPane;

    /*
    Pedir dos números y decir cual es mayor o si son iguales.
    */
// @author Emili
public class Ejercicio_2 {

    public static void main(String[] args) {
        int numero1, numero2;
	
	numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1° numero: "));
	numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2° numero: "));
	
	
        if(numero1>numero2){
            JOptionPane.showMessageDialog(null, "El numero mayor es: "+numero1);
        }else if(numero2>numero1){
            JOptionPane.showMessageDialog(null, "El número mayor es: "+numero2);
        }else{
            JOptionPane.showMessageDialog(null, "Los números son Iguales");
        }
    }
}

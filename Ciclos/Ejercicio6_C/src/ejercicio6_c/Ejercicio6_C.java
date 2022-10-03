package ejercicio6_c;

import javax.swing.JOptionPane;

    /*
    Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros
    introducidos.
    */
// @author Emili
public class Ejercicio6_C {

    public static void main(String[] args) {
        int numero, suma=0;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            suma += numero;
        }while(numero!=0);
    JOptionPane.showMessageDialog(null, "La suma de todos los numeros es: "+suma);
    }
}

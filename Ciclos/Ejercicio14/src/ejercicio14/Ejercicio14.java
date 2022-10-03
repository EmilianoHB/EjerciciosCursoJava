package ejercicio14;

import javax.swing.JOptionPane;

    /*
    Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000.
    */
// @author Emili
public class Ejercicio14 {

    public static void main(String[] args) {
        float sueldo, suma=0;
	int acum=0;
	for(int i=1; i<=10; i++){
            sueldo=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número"));
            if(sueldo>1000){
                acum++;
            }
            suma += sueldo;
            }
        System.out.println("La suma de todos los sueldos es: :"+suma);
        System.out.println("La cantidad de sueldos mayores a $1000 es de: :"+acum);
    }
}

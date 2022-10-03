package ejercicio20;

import javax.swing.JOptionPane;

    /*
    Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
    */
// @author Emili
public class Ejercicio20 {

    public static void main(String[] args) {
        int n, acumN=0;
	float sueldo, maximo=0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos que va a haber"));
	for(int i=1; i<=n; i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo del empleado: "+i));
        if(sueldo>maximo){
            maximo=sueldo;
            acumN=i;
        }
        }
        System.out.println("El empleado: "+acumN+" tiene el sueldo más alto con un monto de: "+maximo);
    }
}

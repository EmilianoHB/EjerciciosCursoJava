package ejercicion21;

import javax.swing.JOptionPane;

    /*
    Pedir 10 numeros, y mostrar al final si se ha introducido alguno negativo.
    */
// @author Emili
public class EjercicioN21 {

    public static void main(String[] args) {
        int n;
	boolean flag= false;
	
        for(int i=1; i<=10; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if(n<0){
                flag=true;
            }
        }
        if(flag=true){
            System.out.println("Se han introducido numero negativos");
        }else{
            System.out.println("No existen numeros negativos");
        }
    }
}

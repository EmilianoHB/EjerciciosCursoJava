package ejercicion22;

import javax.swing.JOptionPane;

    /*
    Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
    */
// @author Emili
public class EjercicioN22 {

    public static void main(String[] args) {
        int n;
	boolean flag= false;
	
        for(int i=1; i<=5; i++){
            do{
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificacion del alumno: "+i));
            }while(n<1 || n>10);
            if(n<4){
                flag=true;
            }
        }
        if(flag=true){
            System.out.println("Hay por lo menos un suspenso");
        }else{
            System.out.println("No existen suspensos");
        }
    }
}

package ejercicio19;

import javax.swing.JOptionPane;

    /*
    Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados
    y suspensos
    */
// @author Emili
public class Ejercicio19 {

    public static void main(String[] args) {
        int nota, acumA=0, acumC=0, acumS=0;
	
	for(int i=1; i<=6; i++){
            do{
                nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del alumno: "+i));
            }while(nota<1 || nota>10);
            if(nota >=6){
                acumA++;
            }else if(nota<=5 && nota>=4){
                acumC++;
            }else{
                acumS++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es de: "+acumA);
        System.out.println("La cantidad de alumnos condicionados es de: "+acumC);
        System.out.println("La cantidad de alumnos suspendidos es de: "+acumS);
    }
}

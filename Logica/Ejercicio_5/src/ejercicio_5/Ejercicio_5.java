package ejercicio_5;

import java.util.Scanner;

    /*
    La calificación final de un estudiante de informática se calcula con base
    a las calificaciones de cuatro aspectos de rendimiento académico:
    participación, primer examen parcial, segundo examen parcial y el examen
    final. Sabiendo que las calificaciones anteriores entran a la calificación
    final con ponderaciones de 10%, 25%, 25%, 40%. Hacer un programa que
    calcule e imprima la calificación final obtenida.

    */
// @author Emili
public class Ejercicio_5 {

    public static void main(String[] args) {
        float participacion, pexamen, sexamen, fexamen, notafinal;
	Scanner entrada= new Scanner(System.in);
	
	System.out.println("Ingrese la nota de participación: ");
	participacion=entrada.nextFloat();
	System.out.println("Ingrese la nota del primer examen parcial: ");
	pexamen=entrada.nextFloat();
	System.out.println("Ingrese la nota del segundo examen parcial");
	sexamen=entrada.nextFloat();
	System.out.println("ingrese la nota del examen final: ");
	fexamen=entrada.nextFloat();
        
        notafinal = ((participacion*0.10f)+(pexamen*0.25f)+(sexamen*0.25f)+(fexamen *0.40f));
	
	System.out.println("La nota final del alumno es: "+notafinal);

    }
}

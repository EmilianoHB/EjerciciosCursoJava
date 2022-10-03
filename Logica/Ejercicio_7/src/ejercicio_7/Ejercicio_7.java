package ejercicio_7;

import java.util.Scanner;

    /*
    Construir un programa que, dado un número total de horas,
    devuelva el número de semanas, dias y horas equivalentes.
    Por ejemplo, 1000 horas, debe mostrar, 5 semanas, 6 dias y 16 horas.
    */
// @author Emili
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int horasrecibidas, semana, dias, horas;

        System.out.println("Ingrese una determinada cantidad de horas: ");
        horasrecibidas=entrada.nextInt();

	/*	horas=horasrecibidas;
	dias=horas/24;
	horas=hora-(dias*24)
	semanas=dias/7;
	dias=dias-(semanas*7);	*/
	
	semana = horasrecibidas / 168;
	dias= horasrecibidas%168 / 24;
	horas= horasrecibidas%24;
	
	System.out.println("Es equivalente a ");
	System.out.println("Semanas: "+semana);
	System.out.println("Días: "+dias);
	System.out.println("Horas: "+horas);

    }
}

package ejercicio_2;

import java.util.Scanner;

    /*
    Hacer un programa que calcule e imprima el salario semanal de un empleado
    a partir de sus horas semanales trabajadas y de su salario por hora.
    */
// @author Emili
public class Ejercicio_2 {

    public static void main(String[] args) {
        int horasSemanales;
	float salarioPH,salario;
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("ingrese el salario del empleado: ");
	salarioPH=entrada.nextFloat();
	System.out.println("ingrese las horas trabajadas por el empleado: ");
	horasSemanales = entrada.nextInt();
	
	salario=salarioPH * horasSemanales;
	
	System.out.println("El salario a pagar al empleado esta semana es de: "+salario);

    }
}

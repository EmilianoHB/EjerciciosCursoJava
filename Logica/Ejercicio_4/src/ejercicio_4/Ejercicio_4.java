package ejercicio_4;

import java.util.Scanner;

    /*
    Una compañía de venta de carros usados, paga a su personal de ventas
    un salario de $1000 mensuales, más una comisión de $150 por cada carro
    vendido, más el 5% del valor de la venta por carro.
    Cada mes el capturista de la empresa ingresa en la computadora los datos
    pertinentes. Hacer un programa que calcule e imprima el salario mensual
    de un vendedor dado.
    */
// @author Emili
public class Ejercicio_4 {

    public static void main(String[] args) {
        final int salariobase=1000;
	int autosvendidos;
	float auto, salariototal;
	Scanner entrada= new Scanner(System.in);
	
	System.out.println("¿Cuantos autos venido el empleado?");
	autosvendidos=entrada.nextInt();
        System.out.println("¿Cuantos cuesta cada auto?");
	auto=entrada.nextFloat();
	
	salariototal=(salariobase+(150*autosvendidos)+(auto*0.05f));

	System.out.println("El vendedor cobrará este mes un total de: "+salariototal);

    }
}

package ejercicio_6;

import java.util.Scanner;

    /*
    Hacer un programa que calcule el cuadrado de una suma.
    	(a+b)2=a2+b2+2ab
    */
// @author Emili
public class Ejercicio_6 {

    public static void main(String[] args) {
        double resultado, a, b;
	Scanner entrada= new Scanner(System.in);
	
	System.out.println("Ingrese el valor de a: ");
	a=entrada.nextDouble();
	System.out.println("Ingrese el valor de b: ");
	b=entrada.nextDouble();
	
	resultado= ((Math.pow(a,2))+Math.pow(b,2)+(2*a*b));
	
	System.out.println("El resultado es de: "+resultado);

    }
}

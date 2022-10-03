package ejercicio_8;

import java.util.Scanner;

    /*
    Construir un programa que calcule y muestre por pantalla las raíces
    de la ecuación de segundo grado de coeficientes reales.
	ax2+bx+c=0
    */
// @author Emili
public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
	double resultado1, resultado2, a, b, c;
	
	System.out.println("Ingrese el valor de a: ");
	a = entrada.nextDouble();
	System.out.println("Ingrese el valor de b: ");
	b = entrada.nextDouble();
	System.out.println("Ingrese el valor de c:  ");
	c = entrada.nextDouble();
	
	resultado1=(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;
	resultado2=(-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;
	
	System.out.println("La primera raíz es igual a: "+resultado1);
	System.out.println("La segunda raíz es igual a: "+resultado2);
    }
}

package ejercicio1;

import java.util.Scanner;

    /*
    Hacer un programa que calcule e imprima la suma de tres calificaciones
    */
// @author Emili
public class Ejercicio1 {

    public static void main(String[] args) {
        float nota1,nota2,nota3, suma;
	Scanner entrada= new Scanner(System.in);

	System.out.println("Digite tres calificaciones: ");
	nota1=entrada.nextFloat();
	nota2=entrada.nextFloat();
	nota3=entrada.nextFloat();

	suma=nota1+nota2+nota3;
	
	System.out.println("La nota es: "+suma);

    }
}

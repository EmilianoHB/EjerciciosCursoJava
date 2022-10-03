package ejercicio_4;

import java.util.Scanner;

    /*
    Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos
    en el siguiente orden: el primero, el último, el segundo, el penúltimo,
    el tercero, etc.
    */
// @author Emili
public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int numeros[] = new int[10];
	
	for(int i=0;i<10;i++){
            numeros[i] = entrada.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print(numeros[i]+"-");
            System.out.print(numeros[9-i]+"-");	
        }
    }
}

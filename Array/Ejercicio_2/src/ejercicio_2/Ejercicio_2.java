package ejercicio_2;

import java.util.Scanner;

    /*
    Leer 5 números, guardarlos en un arreglo y mostrarlos en orden inverso
    al introducido.
    */
// @author Emili
public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int numeros[] = new int[5];
	
	for(int i=0;i<5;i++){
	numeros[i] = entrada.nextInt();
        }
        for(int i=4;i>=0;i--){
        System.out.println(numeros[i]);
        }

    }
}

package ejercicio_1;

import java.util.Scanner;

    /*
    Leer 5 números, guardarlos en un arreglo y mostrarlo en el mismo orden
    introducido.
    */
// @author Emili
public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int numeros[] = new int[5];
	
	for(int i=0;i<5;i++){
	numeros[i] = entrada.nextInt();
        }
        for(int i :numeros){
            System.out.println(i);
        }
    }
}

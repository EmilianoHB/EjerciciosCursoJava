package ejercicio_7;

import java.util.Scanner;

    /*
    Leer por teclado una serie de 10 números enteros. La aplicación debe
    indicarnos si los números están ordenados de forma creciente, decreciente,
    o si están desordenados.
    */
// @author Emili
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int numeros[] = new int [10];
	boolean creciente=false, decreciente=false;

	System.out.println("Digite un numeros: ");
	for(int i=0;i<10;i++){
            numeros[i]=entrada.nextInt();	
        }
        
        for(int i=0;i<9;i++){
            if(numeros[i]<numeros[i+1]){
                creciente=true;
            }
            if(numeros[i]>numeros[i+1]){
                decreciente=true;
            }
        }
        
        if(creciente==true && decreciente==false){
            System.out.println("El array está ordenado de forma creciente");
        }else if(creciente==false && decreciente==true){
            System.out.println("El array está ordenado de forma decreciente");
        }else if(creciente==true && decreciente==true){
            System.out.println("El array es desordenado");
        }else if(creciente==false && decreciente==false){
            System.out.println("El array tiene todos los números iguales.");
        }
    }
}

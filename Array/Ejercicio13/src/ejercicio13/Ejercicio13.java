package ejercicio13;

import java.util.Scanner;

    /*
    Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares
    en la primera,  y a continuación los elementos impares.
    */
// @author Emili
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
       	int numeros[]=new int[10];
	int acump=0, acumi=0;
	
	for (int i = 0; i < 10; i++) {
        System.out.println("Digite un numero:");
        numeros[i]=entrada.nextInt();
            if(numeros[i]%2==0){
                acump++;
            }else{
                acumi++;
            }
        }
        
	int par[]= new int[acump];
	int impar[]=new int[acumi];
	acump=0;
	acumi=0;
	
	for (int i = 0; i < 10; i++) {
            if(numeros[i]%2==0){
                par[acump]=numeros[i];
                acump++;
            }else{
                impar[acumi]=numeros[i];
                acumi++;
            }
        }
        for (int i = 0; i < acump; i++) {
            System.out.println(par[i]);
        }
        for (int i = 0; i < acumi; i++) {
            System.out.println(impar[i]);
        }
    }
}

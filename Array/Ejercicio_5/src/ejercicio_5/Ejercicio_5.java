package ejercicio_5;

import java.util.Scanner;

    /*
    Leer por teclado dos tablas de 10 números enteros y mezclarlas en un
    tercera de la forma: el 1°de A, el 1° de B, el 2° de A, el 2° de B, etc.
    */
// @author Emili
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int a[], b[], c[];
	a=new int[10];
	b=new int[10];
	c=new int[20];
	int j=0;
	
	System.out.println("Digite el primer arreglo: ");
	
        for(int i=0;i<10;i++){
            a[i]=entrada.nextInt();	
        }
        
        System.out.println("Digite el segundo arreglo: ");
	
        for(int i=0;i<10;i++){
            b[i]=entrada.nextInt();	
        }
        for(int i=0;i<10;i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;	
        }
        for(int i:c){
            System.out.println(i);
        }
    }
}

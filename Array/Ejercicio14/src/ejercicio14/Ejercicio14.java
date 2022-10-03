package ejercicio14;

import java.util.Scanner;

    /*
    Leer dos series de 10 enteros, que estaran ordenados crecientemente.
    Copiar (fusionar) las dos tablas en una tercera, de forma que sigan
    ordenados.
    */
// @author Emili
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
       	int numeros[]=new int[10];
	int numeros1[]=new int[10];
	int fusion[]=new int[20];
	boolean creciente=true;
	
	do{
            for(int i=0;i<10;i++){
                System.out.println("Digite un número:");
                numeros[i]=entrada.nextInt();
            }
            for(int i=0;i<9;i++){
                if(numeros[i]<numeros[i+1]){
                    creciente=true;
                }else{
                    creciente=false;
                    break;
                }
            }
            if (creciente==false) {
            	System.out.println("El arreglo no esta ordenado en forma creciente");
            }
        }while(creciente==false);

        creciente=true;
        do{
            for(int i=0;i<10;i++){
                System.out.println("Digite un número:");
                numeros1[i]=entrada.nextInt();
        }
            for(int i=0;i<9;i++){
                if(numeros1[i]<numeros1[i+1]){
                    creciente=true;
                }else{
                    creciente=false;
                    break;
                }
            }
            if (creciente==false) {
            	System.out.println("El arreglo no esta ordenado en forma creciente");
            }
        }while(creciente==false);

        int i=0;
        int j=0;
        int k=0;

        while(i<10 && j<10){
            if(numeros[i]<numeros1[j]){
                fusion[k]=numeros[i];
                i++;
            }else{
                fusion[k]=numeros1[j];
                j++;
            }
            k++;
        }
        if(i==10){
            while(j<10){
                fusion[k]=numeros1[j];
                j++;
                k++;
            }
        }else{
            while(j<10){
                fusion[k]=numeros[i];
                i++;
                k++;
            }
        }
        for ( i = 0; i <20; i++) {
            System.out.println(fusion[i]);
        }
    }
}

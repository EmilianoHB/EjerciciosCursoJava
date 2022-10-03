package ejercicio11_a;

import java.util.Scanner;

    /*
    Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
    Estos los guardaremos en una tabla de tamaño 10. Leer un numero N, e
    incertarlo en el lugar adecuado para que la tabla continue ordenada.
    */
// @author Emili
public class Ejercicio11_A {

    public static void main(String[] args) {
        //-----------------------------------------------------------
        Scanner entrada= new Scanner(System.in);
        int numeros[]=new int[10];
        int n, sition=0,j=0;
        boolean creciente=true;
        
        do {
            
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite un numero:");
                numeros[i]=entrada.nextInt();
            }
            
            for (int i = 0; i < 4; i++) {
                if (numeros[i]<numeros[i+1]) {
                    creciente=true;
                }else{
                    creciente=false;
                    break;
                }
            }
            
            if (creciente==false) {
                System.out.println("El arreglo no esta ordenado en forma creciente");
            }
        
        } while (creciente==false);
        
        System.out.println("Ingresa otro numero: ");
        n=entrada.nextInt();
        
        while (numeros[j]<n&&j<5) {
            sition++;
            j++;
        }
        
        for (int i = 4; i>=sition; i--) {
            numeros[i+1]=numeros[i];
        }
        numeros[sition]=n;
        
        for (int i = 0; i < 6; i++) {
            System.out.println(numeros[i]);
        }
    }
}

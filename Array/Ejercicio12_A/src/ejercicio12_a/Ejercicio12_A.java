package ejercicio12_a;

import java.util.Scanner;

    /*
    Leer por teclado una tabla de 10 elementos numericos enteros y una posicion
    (entre 0 y 9). Eliminar el elemento situado en la posicion dad sin dejar
    huecos.
    */
// @author Emili
public class Ejercicio12_A {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numeros[]=new int[10];
        int  posicion;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite un numero:");
            numeros[i]=entrada.nextInt();
        }
        do {
            System.out.println("Ingresa una posicion: ");
            posicion = entrada.nextInt();
        } while (posicion<0 && posicion>9);
        numeros[posicion]=0;
    }
}

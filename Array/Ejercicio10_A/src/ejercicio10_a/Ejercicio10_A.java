package ejercicio10_a;

import java.util.Scanner;

    /*
    Crear un programa que lea por teclado una tabla de 10 numeros enteros
    y desplace N posiciones en el arreglo (N es digitado por el usuario)
    */
// @author Emili
public class Ejercicio10_A {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        int posicion, acum, j=0;
        for (int i = 0; i < 10; i++) {
            numeros[i]=entrada.nextInt();
        }
        System.out.println("Digite una posicion: ");
        posicion= entrada.nextInt();
        
        do {
            acum = numeros[9];
            for (int i = 8; i>=0; i--) {
            numeros[i+1]= numeros[i];
        }
            numeros[0]=acum;
            j++;
        } while (j!=posicion);
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

    }
}

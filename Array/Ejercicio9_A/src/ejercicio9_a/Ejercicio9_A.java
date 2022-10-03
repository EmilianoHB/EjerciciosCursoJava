package ejercicio9_a;

import java.util.Scanner;

    /*
    Crear un programa que lea por teclado una tabla de 10 numero enteros
y la desplace una posicion hacia abajo: el primero pasa a ser el segundo, el segundo
pasa a ser el tercero y asi sucesivamente. El ultimo pasa a ser el primero.
    */
// @author Emili
public class Ejercicio9_A {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        int acum=0;
        
        for (int i = 0; i < 10; i++) {
            numeros[i]=entrada.nextInt();
        }
        acum += numeros[9];
        
        for (int i = 8; i>=0; i--) {
            numeros[i+1]= numeros[i];
        }
        numeros[0]=acum;
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }
}

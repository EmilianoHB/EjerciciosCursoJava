package ejercicio8_a;

import java.util.Scanner;

    /*
    Diseñar una aplicacion que declare una tabla de 10 elementos enteros. Leer
mediante teclado 8 numeros. Despues se debe pedir un numero y una posicion,
insertarlo en la posicion indicada, desplazando los que esten detras.
    */
// @author Emili
public class Ejercicio8_A {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        int numero, posicion;
        
        for (int i = 0; i < 8; i++) {
            numeros[i]=entrada.nextInt();
        }
        
        System.out.println("Digite un nuermo");
        numero= entrada.nextInt();
        
        System.out.println("Digite una posicion");
        do {
            posicion= entrada.nextInt();
        } while (posicion<0 || posicion>8);
        
        for (int i = 7; i >= posicion ; i--) {
            numeros[i+1]= numeros[i];
        }
        
        numeros[posicion]=numero;
        
        for (int i = 0; i < 9; i++) {
            System.out.println(numeros[i]);
        }
    }
}

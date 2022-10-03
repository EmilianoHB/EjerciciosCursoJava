package ejercicio8_c;

import java.util.Scanner;

    /*
    Pedir un numeroN, y mostrrar todos los numero del 1 a N
    */
// @author Emili
public class Ejercicio8_C {

    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}

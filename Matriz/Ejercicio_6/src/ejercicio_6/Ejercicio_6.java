package ejercicio_6;

import java.util.Scanner;

    /*
    Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera
    y trasponerla en la segunda
    */
// @author Emili
public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriza[][] = new int [2][4];
        int matrizb[][] = new int [4][2];
        int aux;
        
        System.out.println("Rellenar la matriz: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz ("+i+") ("+j+"): ");
                matriza[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La matriz es: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriza[i][j]);
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 2; j++) {
                matrizb[i][j] = matriza[j][i];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizb[i][j]);
            }
            System.out.println("");
        }
    }
}

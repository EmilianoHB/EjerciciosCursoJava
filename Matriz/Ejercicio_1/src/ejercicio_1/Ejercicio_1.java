package ejercicio_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

    /*
    Crear y cargar una matriz de tamaño n x m y decir si esta es simetrica
    o no.
    */
// @author Emili
public class Ejercicio_1 {

    public static void main(String[] args) {
        int matriz[][], nf,nc;
        Scanner entrada = new Scanner(System.in);
        boolean simetrica=true;
        
        nf = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas: "));
        nc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas: "));
        
        matriz= new int[nf][nc];
        
        System.out.println("Digite la matriz: ");
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("Matriz ("+i+")("+j+")");
                matriz[i][j]= entrada.nextInt();
            }
        }
        if (nf==nc) {
            int i=0,j=0;
            while (i<nf && simetrica == true) {
                while (j<i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica==true) {
                System.out.println("La matriz es simetrica");
            }else{
                System.out.println("La matriz no es simetrica");
            }
        }else{
            System.out.println("La matriz no es simetrica");
        }
    }
}

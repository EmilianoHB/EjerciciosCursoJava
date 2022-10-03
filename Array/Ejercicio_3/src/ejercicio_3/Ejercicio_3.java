package ejercicio_3;

import java.util.Scanner;

    /*
    Leer 5 números por teclado, almacenarlos en un arreglo y a continuación
    realizar la media de los números positivos, la media de los números
    negativos y contar el número de ceros.
    */
// @author Emili
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int numeros[] = new int[5];
	float acumP=0, acumN=0;
	int p=0, n=0, cero=0;
	
	for(int i=0;i<5;i++){
	numeros[i] = entrada.nextInt();
	
            if(numeros[i]>0){
                acumP += numeros[i];
		p++;
            }else if(numeros[i]<0){
                acumN += numeros[i];
                n++;
            }else{
                cero++;
            }
        }
        if(p>0){
            acumP /= p;
            System.out.println("La media de los números positivos es: "+acumP);
        }else{
            System.out.println("No se han introducido números positivos");
        }
        if(n>0){
            acumN /= n;
            System.out.println("La media de los números negativos es: "+acumN);
        }else{
            System.out.println("No se han introducido números negativos");
        }
        System.out.println("La cantidad de ceros es: "+cero);
    }
}

package ejercicio15;

import java.util.Scanner;

    /*
    Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
    Se debe mostrar la posición en que se encuentra. Si no está, indicarlo
    con un mensaje.
    */
// @author Emili
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
       	int numeros[]=new int[10];
	int n, lugar=0;
	boolean existe = true, creciente=true;
	
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

        System.out.println("Digite numero a buscar: ");
        n=entrada.nextInt();

        for(int i=0;i<10;i++){
            if(n==numeros[i]){
                lugar=i;
                existe=true;
                break;
            }else{
                existe=false;
            }
        }
        if(existe==true){
            System.out.println("El numero se encuentra en la posicion numero: "+lugar);
        }else{
            System.out.println("No existe ese numero");
        }
    }
}

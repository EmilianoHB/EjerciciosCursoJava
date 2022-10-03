package ejercicio_6;

import java.util.Scanner;

    /*
    Leer los datos correspondientes a dos tablas de 12 elementos numéricos,
    y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la b, otros
    3 de A, otros 3 de la B, etc.
    */
// @author Emili
public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int a[], b[], c[];
	a=new int[12];
	b=new int[12];
	c=new int[24];
	
	System.out.println("Digite el primer arreglo: ");
	for(int i=0;i<12;i++){
            a[i]=entrada.nextInt();	
        }
        
        System.out.println("Digite el segundo arreglo: ");
	for(int i=0;i<12;i++){
            b[i]=entrada.nextInt();	
        }
        
        int i=0, j=0;
        while(i<12){
            for(int k=0;k<3;k++){
                c[j] = a[i+k];
                j++;
            }
            for(int k=0;k<3;k++){
            c[j] = b[i+k];
            j++;
            }
            i+=3;
        }
	
        for( i=0;i<24;i++){
            System.out.print(c[i]+" - ");
        }
    }
}

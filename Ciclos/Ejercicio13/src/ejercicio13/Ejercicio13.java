package ejercicio13;

import javax.swing.JOptionPane;

    /*
    Pedir 10 numeros. Mostrar la media de los numeros positivos, la media de
    los numeros negativos y la cantidad de 0.
    */
// @author Emili
public class Ejercicio13 {

    public static void main(String[] args) {
        int numero, acum=0, acumP=0, acumN=0;
	float mediaP=0, mediaN=0;
	
        for(int i=1; i<=10; i++){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
        
            if(numero>0){
                mediaP += numero;
                acumP++;
            }else if(numero<0){
                mediaN +=numero;
                acumN--;
            }else{
                acum++;
            }
        }
        if(acumP==0){
            System.out.println("No se puede sacar la media de los positivos");
        }else{
            mediaP /=acumP;
            System.out.println("La media de los numeros positivos es:"+mediaP);
        }
        if(acumN==0){
            System.out.println("No se puede sacar la media de los negativos");
        }else{
            mediaN /=acumN;
            System.out.println("La media de los numeros negativos es:"+mediaN);
        }
        if(acum==0){
            System.out.println("No hubo ceros");
        }else{
            System.out.println("La cantidad de 0 fue: : "+acum);
        }
    }
}

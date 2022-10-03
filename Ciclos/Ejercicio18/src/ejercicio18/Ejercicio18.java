package ejercicio18;

import javax.swing.JOptionPane;

    /*
    Hacer unas modificaciones al ejercicio anterior, suponiendo que no se
    introduzca el precio por litro. Solo existen tres productos con precios:
    0,6 $/litro.
    3 $/litro.
    1,25 $/litro.
    */
// @author Emili
public class Ejercicio18 {

    public static void main(String[] args) {
        float facturacionT=0, litros, acumF=0, acumL=0;
	int codigo;
        
        for(int i=1; i<=5; i++){
            do{
                codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del artículo: "+i));
            }while(codigo<1 || codigo>3);
            
            litros=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de litros:"));
            
            switch(codigo){
                case 1: facturacionT += (litros * 0.6f);
                        acumL+=litros;
                        break;
                case 2: facturacionT += (litros * 3);
                        break;
                case 3: facturacionT += (litros * 1.25f);
                        break;
            }
            if(facturacionT>600){
                acumF++;
            }
        }
        System.out.println("La facturación total es: "+facturacionT);
        System.out.println("La cantidad de litros del artículo 1 es: "+acumL);
        System.out.println("La cantidad de facturas de mas de $600 es: "+acumF);

    }
}

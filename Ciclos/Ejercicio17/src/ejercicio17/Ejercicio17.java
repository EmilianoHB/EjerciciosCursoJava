package ejercicio17;

import javax.swing.JOptionPane;

    /*
    Una empresa que se dedica a la venta de desinfectantes necesita un programa
    para gestionar las facturas. En cada factura figura: el código del artículo,
    la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas
    introducidas: facturación total, cantidad de litros vendidos del artículo
    1 y cuantas facturas se emitieron de más de $600.
    */
// @author Emili
public class Ejercicio17 {

    public static void main(String[] args) {
        float precio, facturacionT=0, litros, acumF=0, acumL=0;
	int codigo;
	
        for(int i=1; i<=5; i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del artículo:"));
            precio=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por litro:"));
            litros=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de litros:"));
	
            facturacionT += (precio*litros);
	
            if(precio>600){
                acumF++;
            }
            if(codigo==1){
              acumL+=litros;
            }
        }
        System.out.println("La facturación total es: "+facturacionT);
        System.out.println("La cantidad de litros del artículo 1 es: "+acumL);
        System.out.println("La cantidad de facturas de mas de $600 es: "+acumF);

    }
}

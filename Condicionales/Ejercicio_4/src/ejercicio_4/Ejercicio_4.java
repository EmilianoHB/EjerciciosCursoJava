package ejercicio_4;

import javax.swing.JOptionPane;

    /*
    En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere
    los $300. ¿Cuál será la cantidad que pagará una persona por su compra?
    */
// @author Emili
public class Ejercicio_4 {

    public static void main(String[] args) {
        float precioCompra, descuento;   
        
        precioCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del producto: "));
        
        if (precioCompra>300) {
            descuento =precioCompra*0.20f;
            precioCompra -= descuento;
            JOptionPane.showMessageDialog(null, "El valor de su compra es: "+precioCompra);
        }else{
            JOptionPane.showMessageDialog(null, "El valor de su compra es: "+precioCompra);
        }

    }
}

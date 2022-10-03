package ejercicio14;

import javax.swing.JOptionPane;

    /*
    Hacer un programa que pase de KG a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles.
    */
// @author Emili
public class Ejercicio14 {

    public static void main(String[] args) {
        float medida;
	int opcion;

	medida = Float.parseFloat(JOptionPane.showInputDialog("peso en kg: "));
	opcion=Integer.parseInt(JOptionPane.showInputDialog("A que desea convertir\n"
        +"1.Hectogramos\n"
        +"2.Decagramos\n"
        +"3.Gramos\n"
        +"4.Decigramos\n"
        +"5.Centigramo\n"
        +"6.Miligramo"));

        switch(opcion){
                case 1: medida *= 10;
                        JOptionPane.showMessageDialog(null, "La nueva medida en hectogramos es: "+medida);
                        break;
                case 2: medida *= 100;
                        JOptionPane.showMessageDialog(null, "La nueva medida en decagramos es: "+medida);
                        break;
                case 3: medida *= 1000;
                        JOptionPane.showMessageDialog(null, "La nueva medida en gramos es: "+medida);
                        break;
                case 4: medida *= 10000;
                        JOptionPane.showMessageDialog(null, "La nueva medida en decigramos es: "+medida);
                        break;
                case 5: medida *= 100000;
                        JOptionPane.showMessageDialog(null, "La nueva medida en centigramos es: "+medida);
                        break;
                case 6: medida *= 1000000;
                        JOptionPane.showMessageDialog(null, "La nueva medida en miligramos es: "+medida);
                        break;
                default: JOptionPane.showMessageDialog(null, "Error");
                        break;
        }
    }
}

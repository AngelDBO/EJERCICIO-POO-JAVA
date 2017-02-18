package Carro;

import javax.swing.JOptionPane;

public class provador {

    public static void main(String[] args) {
        Viaje ruta = new Viaje();
        float valor = 0;
        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("     Menu   \n" + "1. Crear ruta \n" + "2. Vender ruta \n"
                    + "3. Modificar codigo de ruta \n " + "4.  Modificar inicio ó destino \n" + "5. Modificar valor de km \n"
                    + "6. Modifica datos de ruta \n" + "7. Salir \n" + "     Entre su opcion"));
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "CREARAS UNA RUTA!!");
                    ruta.setCodigor(JOptionPane.showInputDialog("Ingresa el codigo de la ruta:"));
                    ruta.setInicio(JOptionPane.showInputDialog("Ingrese lugar de salidad"));
                    ruta.setDestino(JOptionPane.showInputDialog("Ingrese lugar de salidad"));
                    ruta.setValorkm(Float.parseFloat(JOptionPane.showInputDialog("Ingrese Ingrese valor de KM")));
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Vender ruta" + "Entrem Kilometros a recorrer");
                    valor = Float.parseFloat(JOptionPane.showInputDialog("Ingres catidad dee km"));
                    ruta.setcostoruta(valor);
                    JOptionPane.showMessageDialog(null, "El valor a pagar es:" + ruta.getValorApagar());
                    break;

                case 3:
                    ruta.setCodigor(JOptionPane.showInputDialog("Ingrese nuevo codigo de ruta"));
                    break;

                case 4:
                    ruta.setInicio(JOptionPane.showInputDialog("Modificar inicio de ruta"));
                    ruta.setDestino(JOptionPane.showInputDialog("Modificar"));
                    break;

                case 5:
                    ruta.setValorkm(Float.parseFloat(JOptionPane.showInputDialog("Ingrese nuevo valor por kilometro")));
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Estos son los datos de la ruta señor(a)");
                    JOptionPane.showMessageDialog(null, "Su codigo es:" + ruta.getCodigor() + "\n Su lugar de salida es " + ruta.getInicio()
                            + "\nSu lugar de destino es " + ruta.getDestino() + "\nSu valor de kilomrtos es " + ruta.getValorkm());

                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Muchas gracias Adios!");
                    break;
                default:

                    JOptionPane.showMessageDialog(null, "Opcion invalida!! \n vuelva a intentar :v");

            }

        } while (op != 7);
    }
}

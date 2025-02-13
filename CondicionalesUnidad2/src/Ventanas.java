import javax.swing.*;
public class Ventanas {
    public static void main(String[] args) {
        //aforo del local lo pasamos de String a int porque es un número entero
        String aforoString = JOptionPane.showInputDialog("Ingrese el aforo");
        int aforo=Integer.parseInt(aforoString);
        //Tomamos el valor de las entradas de un string a un double porque puede tener decimales
        String valorEntrada= JOptionPane.showInputDialog("Ingrese el valor");
        double valorEntradas=Double.parseDouble(valorEntrada);
        //Tomamos el valor de las ventas venidas y lo pasamos de String a Int porque no se puede vender entrada y media
        String entradasVendidas= JOptionPane.showInputDialog("Ingrese el entrada vendida");
        int entradas=Integer.parseInt(entradasVendidas);
        //variables que calculamos

        double entradasOferta;
        double recaudado=valorEntradas*entradas;
        //proceso del if
        if (entradas==aforo){
            if (entradas<aforo*0.20){
                JOptionPane.showMessageDialog(null,"El concierto se Cancela y hay que devolver el dinero");
            } else if (entradas<aforo*0.5) {
                //si el aforo esta al 50%
                JOptionPane.showMessageDialog(null,"Entradas rebajadas un 25%");
                entradasOferta=valorEntradas*=0.75;
                JOptionPane.showMessageDialog(null,"El precio de las entradas es de "+entradasOferta);
            }else{
                //si se vende el aforo completo
                JOptionPane.showMessageDialog(null,"El concierto sigue su marcha, el precio es "+valorEntrada+"€");
            }
            JOptionPane.showMessageDialog(null,"La recaudación hasta el momento es "+recaudado+"€");

        }else{
            JOptionPane.showMessageDialog(null,"No puedes vender tantas entradas");
        }
        }


    }



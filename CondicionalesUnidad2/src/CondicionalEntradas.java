import javax.swing.*;
import java.util.Scanner;
public class CondicionalEntradas {
/*
 escribe un programa para saber la recaudación de un concierto
 el programa pedirá los datos
 n.º de entradas vendidas
 precio de las entradas
 aforo maximo
 si las entradas vendidas no supera el 20% se cancela el concierto
 si las entradas vendidas son del 50%  se rebaja la entrada
Se calcula el precio por entradas vendidas
si el número de entradas es menor que el aforo por 20% salida por
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        * Salida por pantalla de otra manera
        * */
        /*
        * ********/
        String mensaje= JOptionPane.showInputDialog("Ingrese el mensaje");//este tipo de salida solo puede usarse para
        //leer tipo string
        System.out.println(mensaje);
        String aforoString = JOptionPane.showInputDialog("Ingrese el aforo");
        int aforo=Integer.parseInt(aforoString);
        String valorEntrada= JOptionPane.showInputDialog("Ingrese el valor");
        double valorEntradas=Double.parseDouble(valorEntrada);
        String entradasVendidas= JOptionPane.showInputDialog("Ingrese el entrada vendida");
        int entradas=Integer.parseInt(entradasVendidas);
        double entradasOferta;
        double recaudado=valorEntradas*entradas;
    if (entradas<aforo*0.20){
        System.out.println("El concierto se Cancela y hay que devolver el dinero");
    } else if (entradas<aforo*0.5) {
        //si el aforo esta al 50%
        System.out.println("Entradas rebajadas un 25%");
        entradasOferta=valorEntradas*=0.75;
        System.out.println("El precio de las entradas es ->"+entradasOferta);
    }else{
        //si se vende el aforo completo
            System.out.println("El concierto sigue su marcha, el precio es "+valorEntradas+"€");
    }
        System.out.print("La recaudacion hasta el momento es de: "+recaudado);
    }
}

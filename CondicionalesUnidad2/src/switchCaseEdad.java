import javax.swing.*;

public class switchCaseEdad {
    public static void main(String[] args) {
        String edadT = JOptionPane.showInputDialog("Ingresa tu edad");
        byte edad;
        String mensaje;
        try {
            edad = Byte.parseByte(edadT);
        } catch (NumberFormatException e) {
            edad=-1;
        }
        if (edad >= 1 && edad <= 12) {
            mensaje = "Eres un niño";
        } else if (edad>=13&&edad <= 15) {
            mensaje = "Eres un puberto";
        } else if (edad >= 16 && edad <= 18) {
            mensaje = "Eres un adolescente";
        } else if (edad >= 19 && edad <= 64) {
            mensaje = "Eres un adulto";
        } else if (edad >= 61 && edad<=67) {
            mensaje = "Estas esperando para jubilarte";
        } else if (edad>=68) {
            mensaje = "Eres un jubilado, ¿Estas mirando obras 👷👷?";
        } else {
            mensaje="La edad esta mal";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

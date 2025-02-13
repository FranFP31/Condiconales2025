import javax.swing.*;
public class SwitchCaseColores {
    public static void main(String[] args) {
       /* ejemplo
       a=10
       switch(a-2){
       para no tener que estar poniendo break en todos los case ponemos
        -> "La flechita" al final del case
       case1:sout("Hola")
       case2:sout(me)
       case5:sout
       case8:sout!!!(hay que ponerle un break para que salga cuando se cumpla la condicion)
       default:sout(son las instrucciones para cuando todo lo demas falla)
        */
        //Ejemplo con colores
        String color = JOptionPane.showInputDialog("Inserta un color");
        String mensaje="";
      switch (color){
          case "rojo"->mensaje="Vuelvete a rusia 🪆🪆🪆";
          case "azul"->mensaje="Te gusta el cielo 😎😎😎";
          case "verde"->mensaje="Te gusta la naturaleza 🐸🐸🐸";
          case "amarillo"->mensaje="Te gusta el sol☀️☀️☀️";
          case "rosa"->mensaje="Hay piratuelo 🏳️‍🌈🏳️‍🌈🏳️‍🌈🏳️‍🌈";
          case "negro"->mensaje="Ve al psicologo 🐈‍⬛🐈‍⬛🐦‍⬛🐦‍⬛";
          case "blanco"->mensaje="Otro mas del madrid 🤍🤍🤍🤍";
          case "fucsia"->mensaje="Otro piratuelo ️‍🌈🏳️‍🌈🏳️‍🌈🏳️‍🌈";
          default->mensaje="El color no existe";
      }
      JOptionPane.showMessageDialog(null,mensaje);
    }
}

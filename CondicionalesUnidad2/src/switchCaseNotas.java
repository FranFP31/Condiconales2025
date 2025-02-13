import javax.swing.*;

public class switchCaseNotas {
    public static void main(String[] args) {
        String notaT= JOptionPane.showInputDialog("Ingresa una nota");
        byte nota;
        //se evita un error de tipo de dato cuando el usuario ingresa la nota
        try {//intenta el error
             nota = Byte.parseByte(notaT);
        }catch (NumberFormatException e){//captura el error y cambia el error por -1
             nota=-1;
        }
        String mensaje;
    //Con la nota, vamos a indicar el nivel que tiene el alumno
        switch(nota){
            case 0,1,2,3,4->mensaje="Nivel: Suspenso->Tienes que estudiar mas";
            case 5->mensaje="Nivel: Suficiente,->apruebas raspado";
            case 6->mensaje="Nivel:Bien->Un poquito mas...";
            case 7,8-> mensaje="Nivel:Notable->Te has esforzado";
            case 9-> mensaje="Nivel:Sobresaliente->Muy bien";
            case 10-> mensaje="Nivel:Matricula de Honor->Sal a que te de el aire, o a tocar césped";
            default -> mensaje="Nivel: No hay notas tiene que ser entre 0 y 10";
        }
    JOptionPane.showMessageDialog(null, mensaje);
    }
}

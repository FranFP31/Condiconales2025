import javax.swing.*;

public class swtichCaseCalculadora {
    public static void main(String[] args) {
        double num1C, num2C;
        String num1 = JOptionPane.showInputDialog("Ingresa el primer numero");
        String num2 =JOptionPane.showInputDialog("Ingresa el segundo numero");
        double result;
        int result2;
        try {
            num1C=Double.parseDouble(num1);
            num2C=Double.parseDouble(num2);
        }
        catch (NumberFormatException e) {
            num1C=-1;
            num2C=-1;
            JOptionPane.showMessageDialog(null, "El numero no es valido");
        }
        String mensaje = "";
        int selectOperando;
        String selectOperandoC =JOptionPane.showInputDialog("Ingresa el primer operador\n [1]Suma \n[2] Resta \n[3] Multiplica\n[4] Division\n [5] Modulo");
        try{
        selectOperando=Integer.parseInt(selectOperandoC);
        }
        catch (Exception e){
            selectOperando=-1;
        }
        switch(selectOperando) {
           case 1->{
               result=num1C+num2C;
               mensaje ="La suma de: "+num1+" + "+num2+"es "+ result;
               System.out.println(result);
               JOptionPane.showMessageDialog(null, mensaje);
           }
           case 2->{
               result=num1C-num2C;
               mensaje="La resta de:"+num1+" - "+num2+" es "+result;
               System.out.println(result);
               JOptionPane.showMessageDialog(null, mensaje);
           }
           case 3->{
               result=num1C*num2C;
               mensaje="El "+num1+" multiplicado por"+num2+" es "+result;
               System.out.println(result);
               JOptionPane.showMessageDialog(null, mensaje);
           }
           case 4->{
               result=num1C/num2C;
               mensaje="El "+num1+"Divido entre"+num2+" es "+result;
               System.out.println(result);
               JOptionPane.showMessageDialog(null, mensaje);
           }
           case 5->{
               result=num1C%num2C;
               mensaje="El resto de "+num1+" y "+num2+" es"+result+" ";
               JOptionPane.showMessageDialog(null, mensaje);
               System.out.println(result);
           }
           default -> mensaje= JOptionPane.showInputDialog("Elige una opcion valida Señor Garrelson");
       }
       
    }
    
}

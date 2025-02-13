import java.util.Scanner;

public class CondicionalFecha {
    public static void main(String[] args) {
        /*
        Solicitar por teclado una fecha(day-month-año), e indicar si la fecha
        es correcta->31-02-2025->fecha incorrecta
        primero pedimos el day, luego el month y el año
        1.declaramos el scanner
        2.solicitamos el day y almacenamos el dato
        3.solicitamos el month y almacenamos el dato
        4.solicitamos el año y almacenamos el dato


        **/
        Scanner entrada = new Scanner(System.in);
        byte day,month;
        Short year;
        //creamos una variable booleana que almacernara si la fecha es correcta o no
        boolean fechaCorrecta;
        System.out.print("Ingresa el dia-> ");
        day = entrada.nextByte();
        System.out.print("Ingresa el mes-> ");
        month = entrada.nextByte();
        System.out.print("Ingresa el año-> ");
        year = entrada.nextShort();
        //validamos si el año es mayor que cero
        if (year==0) {
            fechaCorrecta = false;
        }else{
            if (month==2&&(day>=1&&day<=28)){
            fechaCorrecta=true;
            } else if ((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&(day>=1&&day<=31)) {
                fechaCorrecta=true;
            }else if ((month==4||month==6||month==9||month==11)&&(day>=1&&day<=30)) {
                fechaCorrecta=true;
            }else{//cualquier otro caso-> fecha incorrecta
                fechaCorrecta=false;
            }
        }if (fechaCorrecta) {//if (fechaCorrecta==true)
            System.out.println("La fecha "+day+"-"+month+"-"+year+" es correcta");
        }
        else{
            System.out.println("La fecha "+day+"-"+month+"-"+year+" es ERRONEA");
        }

    }

}

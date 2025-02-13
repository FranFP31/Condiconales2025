import java.util.Scanner;

public class CondicionalesCifras {
    public static void main(String[] args) {
        /*
        Solicitar un numero al usuario e indicar las cifrras
        que tiene
        Delimitar que el numero este entre 0 y 9999
        1-Declaramos el scaner
        2-solicitamos el numero
        3- declaramos las variables y leemos el número
        4.  si el numero esa comprendido entre 0 y9 -> tiene una cifra
            si el numero esta entre 10 y 99 tiene dos cifras
            si esta entre 100 y 999 tiene 3 cifras
            si esta entre 1000 y 9999 tiene 4 cifras
            Caso 0"Una cifra": (numero<=0&&numero<10)
            caso 1"Dos cifras":(numero<=10&&numero<=99)
            caso 2 "Tres cifras: (numero>=100 &&numero<=999)
            caso 3 "Cuatro cifras": (Numero>=1000&numero<=9999)
        * */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero:-> ");
        int num = entrada.nextInt();
        if (num>=0&&num<=99999){
            System.out.println("Vamos a ver el numero de cifras de... "+num);
            if (num>=0&&num<=9) {
                System.out.println("El numero es: " + num+" y tiene una cifra");
            }else if (num>=10&&num<=99) {
                System.out.println("El numero es: " + num + " y tiene dos cifras");
            } else if (num>=100&&num<=999) {
                System.out.println("El numero es: " + num + " y tiene tres cifras");
            }else if (num>=1000&&num<=9999){
                System.out.println("El numero es: " + num + " y tiene cuatro cifras");
            } else if (num>=10000&&num<=99999) {
                System.out.println("El numero es: "+num +" tiene cinco cifras");
            }
        }else{
            System.out.println("El numero " + num+ " no esta en el rango esta entre 0 y 99.999");
        }


    }
}

import java.util.Scanner;

public class EjercicioCondicionalesIfElse {
    public static void main(String[] args) {
        /*
        Solicitar dos números e indicar si son iguales, en caso contrario mostrar que son diferentes
        De los dos números ingresados, indica cuál es mayor
        */
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        //entrada del primer número var num1
        System.out.print("Introduce el primer digito->");
        num1 = entrada.nextInt();
        //entrada del segundo número var num2
        System.out.print("Introduce el segundo digito->");
        num2 = entrada.nextInt();
        // If else --> Anidados
        //Primero evaluamos si son iguales y si son distintos ya procedemos a comparar cuál de los dos
        //es mayor que el otro en el else if
        //importante-> las sangrias
        if (num1==num2) {//comprobación si son iguales
            System.out.println("Los números son iguales");
        }else if (num1>num2) {//se puede juntar el else con el if de esta manera --> else if(condición)
            //si el primer número es mayor que el segundo
                System.out.println("El Número 1: "+num1+" es mayor que el Número 2: "+num2);
            }else{
            //si el segundo número es mayor que el primero
                System.out.println("El Número 2: "+num2+" es mayor que el Número 1: "+num1);
            }
        }

    }


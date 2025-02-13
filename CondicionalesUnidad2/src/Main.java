/*
*** Clase sobre condicional Simple if ***
    Sintaxis:
    if(condicion a evaluar){
    Bloque de instrucciones
    }
*/


import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Indique su edad");
        byte edad = sc.nextByte();//esta es una variable de ambito global que puede estar en todo el codigo
        //donde sea necesario
        if (edad>=18){
            //Bloque de instrucciones en caso de ser true o cumplirse la condicion
            //Un bloque de instrucciones es un conjunto de sentencias delimitadas por { }
            System.out.println("Eres mayor de edad");
            edad++;//le incremento en 1
            System.out.println("El año que viene tendras "+edad);
        }*/
        /*Ambito de la variable*/
       /* System.out.println("EDAD "+edad);
        if(edad>=18){
            byte mayoriaEdad=18;//esta variable esta declarada dentro del if

            System.out.println("Tu edad es igual o mayor que "+mayoriaEdad);
        }*/

        //mayoriaEdad++;//esta variable no existe fuera del bloque if fuera del bloque provoca un error
       // byte mayoriaEdad=18;
        //es una variable de ambito local
        /*aunque es recomendable usar las {} en las condiciones que solo tengan una linea de
        bloque de sentencia estas se puenden suprimir
        de tener mas de una linea en el bloque usamos las {}*/
        /*if (edad<18)
            System.out.println("eres menor de edad");*/
        /*Ejercicio
            Solicita por teclado un numero y si es menor de 0 indicar que es negativo

         */
        byte numero;
        System.out.print("Inserta un numero->");//pedimos el numero
        numero = sc.nextByte();//almaceno la variable del numero
        if (numero != 0){//compruebo que sea distinto a cero
            if (numero>=0||numero%2==0){//si es distinto a 0 y es positivo
                System.out.println("Tu numero "+numero+" es positivo");
                if (numero%2==0){
                    System.out.println("Tu numero "+ numero+" es par");
                }
                else{
                    System.out.println("Tu numero " +numero+ " es impar");
                }
            }else{//si es distinto a 0 y es negativo
                System.out.println("Tu numero "+numero+" es negativo");
                if (numero%2==0){
                    System.out.println("Tu numero "+ numero+" es par");
                }
                else{
                    System.out.println("Tu numero " +numero+ " es impar");
                }
            }
        }else{//si es 0
            System.out.println("Donde vas con el 0 aguililla");
        }
        /*
        *************** Condicion IF- ELSE *****************
        */
        /*Sintaxis:
            if(evaluacion de condicion){
            Bloque de instrucciones si es true la evaluacion
            }else{
            Bloque de instrucciones si es false la evaluacion
            }
         */
        //Ejemplo: con el numero solicitado anteriormente, evaluamos si es par o impar-> numero%2==0, en caso de ser falso se va al else
      /**  if (numero%2==0){
            System.out.println("Tu numero "+ numero+" es par");
        }
        else{
            System.out.println("Tu numero" +numero+ " es impar");
        }**/


    }
}

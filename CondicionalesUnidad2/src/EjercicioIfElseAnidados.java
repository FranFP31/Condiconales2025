import java.util.Scanner;

public class EjercicioIfElseAnidados {
    public static void main(String[] args) {
        /*
        Solicitar 3 numeros e indicar el orden de mayor a menor
        1.Establecer el Scanner
        2.Solicitar y leer los numeros
        3.Comenzar a comparar los numeros utilizando if else anidados
         Compruebo que no son iguales
         si no son iguales
         Caso 0 a>b&&b>c -> a,b,c
         Caso 1 a>c&&b<c -> a,c,b
         Caso 2 b>a&&a<c -> b,a,c
         Caso 3 b>a&&c<a -> b,c,a
         Caso 4 c>a&&a>b -> c,a,b
         Caso 5 c>b&&c>a -> c,b,a

        */
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = sc.nextInt();
        System.out.print("Ingrese el valor de c: ");
        c = sc.nextInt();
        if (a!=b &&a!=c){
            System.out.println("Los valores son Validos");
            if (a>b&&a>c){
                System.out.println("Caso 0: a"+ a+" b "+ b+" c "+ c);
            }else if(a>b&&b>c){
                System.out.println("Caso 1: a "+ a+" c "+ c +" b "+ b);
            }else if(a>c&&c>b){
                System.out.println("Caso 2: b "+ b +" a "+ a+" c "+c );
            } else if (b>a&&a>c) {
                System.out.println("Caso 3: b "+ b +" a "+ c+" c "+a);
            } else if(c>a&&a>b){
                System.out.println("Caso 4: c "+ c+" a "+ a +"b "+ b);
            }else if(c>b&&b>a) {
                System.out.println("Caso 5: c " + c + " b " + b + " a " + a);
            }
        }else {
            if (a==b){
                System.out.println("Los valores: A "+a+" y B "+b+" Son iguales");
            } else if (a==c) {
                System.out.println("Los valores: A "+a+" y C "+c+" Son iguales");
            } else if (b==c) {
                System.out.println("Los valores: B "+b+" y C "+c+" Son iguales");
            }else if(a==b&&c==b){
                System.out.println("Todos son iguales ");
            }
        }
    }
}

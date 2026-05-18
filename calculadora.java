import java.util.Scanner;

/**
 * Esta clase encapsula la logica de opecaiones artemticas basicas, como suma, resta,multiplicacion y division.
 */

public class calculadora {

// scanner para leer la entrada del usuario
    public static void main(String[] args) {
        ejecutar();
    }
   /**
    * Este metodo ejecuta la logica de la calculadora, solicitando al usuario dos numeros y una operacion, y luego realiza la operacion correspondiente.
    */
    static Scanner sc = new Scanner(System.in);

    static void ejecutar () {
        System.out.println("Calculadora");
        System.out.println("primer numero");
        double num1 = sc.nextDouble();
        System.out.println("segundo numero");
        double num2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("operacion +,-,*,/");
        String operacion = sc.nextLine();

        if (operacion.equals("+")){
            System.out.println("=" + (num1 + num2));
        } else if (operacion.equals ("-")){
            System.out.println("=" + (num1 - num2));
        } else if (operacion.equals ("*")){
            System.out.println("=" + (num1 * num2));   
        } else if (operacion.equals("/")){
            if (num2 == 0){
                System.out.println("no se puede dividir entre cero");
            } else {
                System.out.println("=" + (num1 / num2));
            }
        }else{
            System.out.println("operacion no valida");
        }
    }
} 
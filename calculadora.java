import java.util.Scanner;


public class calculadora {

    public static void main(String[] args) {
        ejecutar();
    }
   
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
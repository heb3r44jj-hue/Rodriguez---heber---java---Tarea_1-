// Este programa muestra la tabla de multiplicar de un numero ingresado por el usuario
public class TablaMultiplicar {
    public static void ejecutar(){
        System.out.println("Tabla de multiplicar");
        System.out.println("ingrese un numero");
        int numero = Menu_Principal.sc.nextInt();
        Menu_Principal.sc.nextLine();
        
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        
        }
    }
}

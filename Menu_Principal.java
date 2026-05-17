import java.util.Scanner;

public class Menu_Principal {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do { 
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    calculadora.ejecutar();
                    break;
                case 2:
                    parOImpar.ejecutar();
                    break;
                case 3:
                    TablaMultiplicar.ejecutar();
                    break;
                case 4: 
                    contador_Vocales.ejecutar();
                    break;
                case 5: 
                    promedioNotas.ejecutar();
                    break;
                case 6:
                    ejercicioEstudiantes.ejecutar();
                    break;
                case 7:
                    cuentaBancaria.ejecutar();
                    break;
                case 8: 
                    herencia_Vehiculos.ejecutar();
                    break;
                case 9:
                    matriz.ejecutar();
                    break;
                case 10:
                    sistema_Inventario.ejecutar();
                    break;
                case 11:
                    System.out.println("salir del programa");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }


            
        } while (opcion != 11);

        sc.close();     
    }
    static void mostrarMenu(){
        System.out.println("\n================================");
        System.out.println("          Menu principal         ");
        System.out.println("================================");
        System.out.println("Menu Principal");
        System.out.println("  [1] Calculadora");
        System.out.println("  [2] Par o impar");
        System.out.println("  [3] Tabla de multiplicar");
        System.out.println("  [4] Contador de vocales");
        System.out.println("  [5] Promedio de notas");
        System.out.println("  [6] Ejercicio de estudiantes");
        System.out.println("  [7] Cuenta bancaria");
        System.out.println("  [8] Herencia de vehículos");
        System.out.println("  [9] Matriz");
        System.out.println("  [10] Sistema de inventario");
        System.out.println("  [11] Salir");

    }


}

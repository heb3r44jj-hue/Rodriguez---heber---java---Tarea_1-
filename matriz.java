public class matriz {
    public static void ejecutar(){
        System.out.println("Matriz de 3x3");
        int[][] matriz = new int [3][3];
        int suma = 0;

        System.out.println ("Ingrese los 9 valores");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = Menu_Principal.sc.nextInt();
                suma += matriz[i][j];
            }
        }
        Menu_Principal.sc.nextLine();
        System.out.println("Matriz: " );
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma: " + suma);
    }
}

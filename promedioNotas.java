public class promedioNotas {
    public static void ejecutar(){
        System.out.println("Promedio de notas");
        System.out.println("ingrese la cantidad de notas");
        int cantidad = Menu_Principal.sc.nextInt();
        Menu_Principal.sc.nextLine();
        
        double suma = 0;
        for (int i = 1; i <= cantidad; i++){
            System.out.println("Nota" + i + ":");
            suma += Menu_Principal.sc.nextDouble();

        }
        Menu_Principal.sc.nextLine();
        double promedio = suma / cantidad;
        System.out.println("promedio de notas:" + promedio);

        if (promedio >= 70){
            System.out.println("aprobado");
        }else{
            System.out.println("reprobado");
        }
    }
}

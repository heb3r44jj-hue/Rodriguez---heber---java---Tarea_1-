
/**
 * Esta clase implementa el sistema de inventario para gestionar productos.
 */
public class sistema_Inventario {
    public static void ejecutar(){
        System.out.println("Sistema de Inventario");
        Producto[] inventario = new Producto[5];
        int total = 0;
        int opcion;

        do { 
            System.out.println("1. Agragar producto | 2. Mostrar inventario | 3. volver");
            System.out.print("Opcion:");
            opcion = Menu_Principal.sc.nextInt();
            Menu_Principal.sc.nextLine();
            
            if (opcion == 1){
                if (total < 5){
                System.out.print("Nombre: ");
                String nombre = Menu_Principal.sc.nextLine();
                System.out.print("Precio:");
                double precio = Menu_Principal.sc.nextDouble();
                Menu_Principal.sc.nextLine();
                inventario[total] = new Producto(nombre, precio);
                total++;
                System.out.println("Producto agregado");
            } else{
                System.out.println("Iventario lleno");
            }
            }else if (opcion == 2){
                if (total == 0){
                    System.out.println("Inventario vacio");
                } else {
                    for (int i = 0; i < total; i++){
                        inventario[i].mostrarInformacion();
                    }
                }
            }
        } while (opcion != 3);
    }
}



class Producto {
    String nombre;
    double precio;

    Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarInformacion(){
        System.out.println("Producto: " + nombre + " Precio:" + precio) ;
    }
}
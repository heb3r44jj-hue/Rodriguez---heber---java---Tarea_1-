public class herencia_Vehiculos {
    public static void ejecutar(){
        System.out.println( " Herencia de vehiculos");
        System.out.println("Marca del vehiculo: ");
        String marca = Menu_Principal.sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = Menu_Principal.sc.nextLine();
        System.out.print("Año: ");
        int año = Menu_Principal.sc.nextInt();
       
        Menu_Principal.sc.nextLine();
        Vehiculo vehiculo = new Vehiculo (marca, modelo, año);
        System.out.println("Informacion del vehiculo");
        vehiculo.mostrarInformacion();
    }
    
}

class Vehiculo {
    String marca;
    String modelo;
    int año;

    Vehiculo(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    void mostrarInformacion(){
        System.out.println("Marca: "+ marca + "Modelo: " + modelo + "Año: " + año);

     }
}

class vehiculo extends Vehiculo{
    int puertas;
    vehiculo (String marca, String modelo, int año, int puertas){
        super(marca, modelo, año);
        this.puertas = puertas;   
     }
     @Override
     void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Puertas:" + puertas);
     }

}

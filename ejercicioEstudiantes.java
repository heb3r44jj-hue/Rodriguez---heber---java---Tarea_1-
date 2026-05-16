public class ejercicioEstudiantes {
    public static void ejecutar(){
        System.out.println("clase estudiantes");
        System.out.println("Nombre");
        String nombre = Menu_Principal.sc.nextLine();
        System.out.print("Matricula");
        String matricula = Menu_Principal.sc.nextLine();
        System.out.print("Nota: ");
        double nota = Menu_Principal.sc.nextDouble();
        Menu_Principal.sc.nextLine();

        Estudiante ObjetoEstudiante = new Estudiante (nombre, matricula, nota);
        ObjetoEstudiante.mostrarInformacion();

    }
}

class Estudiante {
     String nombre;
     String matricula;
     double nota;

    public Estudiante(String nombre, String matricula, double nota){
        this.nombre = nombre;
        this.matricula = matricula;
        this.nota = nota;
    }

    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + " matricula: " + matricula + " nota: " + nota);
        if (nota >= 70){
            System.out.print("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
        
    }

    
}


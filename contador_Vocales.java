// Este programa cuenta el numero de vocales en una palabra o oracion ingresada por el usuario
public class contador_Vocales {
    public static void ejecutar(){
        System.out.println("contador de vocales");
        System.out.println("ingrese una palabra o oracion ");
        String texto = Menu_Principal.sc.nextLine();

        int contador = 0;
        for (int i=0; i < texto.length(); i++ ){
            char letra = texto.charAt(i);
            if (letra == 'a'|| letra == 'e' || letra == 'i'|| letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                contador++;
            }
        }
        System.out.println("numero de vocales: " + contador );

    }
}

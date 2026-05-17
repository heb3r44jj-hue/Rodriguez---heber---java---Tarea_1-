public class parOImpar {
    public static void ejecutar(){
        System.out.println("par o impar");
        System.out.println("ingrese un numero");
        int numero = Menu_Principal.sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("El numero es par: " + numero);
        }else{
            System.out.println("El numero es impar: " + numero);

        }
     }

}




    

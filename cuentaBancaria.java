public class cuentaBancaria {
    public static void ejecutar(){
        System.out.println("cuanta bancaria");
        System.out.println("Titular:  ");
        String titular = Menu_Principal.sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = Menu_Principal.sc.nextDouble();
        Menu_Principal.sc.nextLine();

        Cuenta CuentaBancaria = new Cuenta (titular, saldo);

        int opcion;
        do{
            System.out.println("1. Depositar | 2. Retirar | 3. Mostrar información | 4. Salir");
            System.out.print("opcion: ");
            opcion = Menu_Principal.sc.nextInt();
            Menu_Principal.sc.nextLine();

            if (opcion == 1){
                System.out.print("Monto a depositar: ");
                CuentaBancaria.depositar(Menu_Principal.sc.nextDouble());
                Menu_Principal.sc.nextLine();
            } else if (opcion == 2){
                System.out.print("Monto a retirar: ");
                CuentaBancaria.retirar(Menu_Principal.sc.nextDouble());
                Menu_Principal.sc.nextLine();
            } else if (opcion == 3){
                CuentaBancaria.verSaldo();
            }

        } while (opcion != 4);

    }
}

class Cuenta {
    String titular;
    double saldo;

    Cuenta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar (double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Saldo actual: " + saldo);
        }
    }
    
    void retirar (double monto){
        if (monto <= saldo){
            saldo -= monto;
            System.out.println("Saldo actual: " + saldo);
        } else {
            System.out.println ("Saldo insuficiente");

        }
        
    }

    void verSaldo(){
            System.out.println("Titular: " + titular + " Saldo: " + saldo);
    }

}

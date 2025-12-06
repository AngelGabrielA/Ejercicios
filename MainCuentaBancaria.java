import java.util.Scanner;
public class MainCuentaBancaria {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CuentaBancaria c=new CuentaBancaria("Juan",500);

        System.out.print("Depositar monto: ");
        c.depositar(sc.nextDouble());

        System.out.print("Retirar monto: ");
        boolean ok=c.retirar(sc.nextDouble());

        System.out.println(ok? "Retiro exitoso":"Fondos insuficientes");
        System.out.println("Saldo final: "+c.getSaldo());
    }
}
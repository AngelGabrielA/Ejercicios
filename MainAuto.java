import java.util.Scanner;
public class MainAuto {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Auto a=new Auto(50);

        System.out.print("Gasolina a consumir: ");
        boolean ok=a.conducir(sc.nextDouble());

        System.out.println(ok? "Viaje realizado":"No alcanza gasolina");
        System.out.println("Restante: "+a.getGasolina());
    }
}
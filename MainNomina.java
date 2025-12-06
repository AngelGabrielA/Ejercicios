import java.util.Scanner;
public class MainNomina {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Nomina n=new Nomina("Luis",9000);

        System.out.print("Días trabajados: ");
        System.out.println("Pago: "+n.calcularPago(sc.nextInt()));
    }
}
import java.util.Scanner;
public class MainProducto {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Producto p=new Producto("Laptop",10);

        System.out.print("¿Cuántas deseas comprar? ");
        boolean ok=p.vender(sc.nextInt());

        System.out.println(ok? "Venta realizada":"Stock insuficiente");
        System.out.println("Stock actual: "+p.getStock());
    }
}
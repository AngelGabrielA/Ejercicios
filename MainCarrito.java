import java.util.Scanner;
public class MainCarrito {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Carrito c=new Carrito();

        System.out.print("Agregar precio: ");
        c.agregar(sc.nextDouble());

        System.out.print("Agregar otro precio: ");
        c.agregar(sc.nextDouble());

        System.out.println("Total: "+c.getTotal());
    }
}
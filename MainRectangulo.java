import java.util.Scanner;
public class MainRectangulo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Ancho: ");
        double w=sc.nextDouble();
        System.out.print("Alto: ");
        double h=sc.nextDouble();

        Rectangulo r=new Rectangulo(w,h);
        System.out.println("Área: "+r.area());
        System.out.println("Perímetro: "+r.perimetro());
    }
}
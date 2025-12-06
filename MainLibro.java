import java.util.Scanner;
public class MainLibro {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Libro l=new Libro("El Quijote");

        System.out.print("1=Prestar, 2=Devolver: ");
        int op=sc.nextInt();

        boolean ok= op==1? l.prestar():l.devolver();
        System.out.println(ok? "Operación exitosa":"Operación no válida");
    }
}
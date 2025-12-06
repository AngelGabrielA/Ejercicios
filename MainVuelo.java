import java.util.Scanner;
public class MainVuelo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Vuelo v=new Vuelo("AB-100",50,20,150);

        System.out.print("¿Cuántos boletos quieres reservar? ");
        int n=sc.nextInt();
        int exito=0;

        for(int i=0;i<n;i++){
            if(v.reservar()) exito++;
        }

        System.out.println("Reservas logradas: "+exito);
        System.out.println("Total reservados: "+v.getReservados());
        System.out.println("Porcentaje: "+v.porcentaje());
        System.out.println("Ingreso: "+v.total());
    }
}
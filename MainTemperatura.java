import java.util.Scanner;
public class MainTemperatura {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Temperatura t=new Temperatura();

        System.out.print("C°: ");
        System.out.println("F°: "+t.cToF(sc.nextDouble()));
    }
}
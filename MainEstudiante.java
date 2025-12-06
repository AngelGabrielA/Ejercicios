import java.util.Scanner;
public class MainEstudiante {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Estudiante e=new Estudiante("Pedro");

        for(int i=0;i<3;i++){
            System.out.print("Calificación "+(i+1)+": ");
            e.setCal(i,sc.nextDouble());
        }

        System.out.println("Promedio: "+e.promedio());
    }
}
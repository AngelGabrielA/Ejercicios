public class Estudiante {
    private String nombre;
    private double[] cal;

    public Estudiante(String nombre){
        this.nombre=nombre;
        cal=new double[3];
    }

    public void setCal(int i,double v){ cal[i]=v; }
    public double promedio(){ return (cal[0]+cal[1]+cal[2])/3.0; }
}
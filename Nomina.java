public class Nomina {
    private String empleado;
    private double salario;

    public Nomina(String empleado,double salario){
        this.empleado=empleado;
        this.salario=salario;
    }
    public double calcularPago(int dias){
        return salario/30*dias;
    }
}
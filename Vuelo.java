public class Vuelo {
    private String codigo;
    private int capacidad;
    private int reservados;
    private double costo;

    public Vuelo(String codigo, int capacidad, int reservados, double costo){
        this.codigo=codigo;
        this.capacidad=capacidad;
        this.reservados=reservados;
        this.costo=costo;
    }

    public boolean reservar(){
        if(reservados<capacidad){
            reservados++;
            return true;
        }
        return false;
    }

    public int getReservados(){ return reservados; }
    public String getCodigo(){ return codigo; }
    public double porcentaje(){ return (reservados*100.0)/capacidad; }
    public double total(){ return costo*reservados; }
}
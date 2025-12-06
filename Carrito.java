public class Carrito {
    private double total;

    public void agregar(double precio){
        total+=precio;
    }
    public double getTotal(){ return total; }
}
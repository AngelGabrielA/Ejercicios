public class Producto {
    private String nombre;
    private int stock;

    public Producto(String nombre,int stock){
        this.nombre=nombre;
        this.stock=stock;
    }

    public boolean vender(int qty){
        if(qty<=stock){ stock-=qty; return true; }
        return false;
    }
    public int getStock(){ return stock; }
}
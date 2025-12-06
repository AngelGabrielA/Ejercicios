public class Rectangulo {
    private double w,h;

    public Rectangulo(double w,double h){
        this.w=w; this.h=h;
    }

    public double area(){ return w*h; }
    public double perimetro(){ return 2*(w+h); }
}
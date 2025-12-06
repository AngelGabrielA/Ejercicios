public class Libro {
    private String titulo;
    private boolean prestado;

    public Libro(String titulo){
        this.titulo=titulo;
        this.prestado=false;
    }
    public boolean prestar(){
        if(!prestado){ prestado=true; return true; }
        return false;
    }
    public boolean devolver(){
        if(prestado){ prestado=false; return true; }
        return false;
    }
}
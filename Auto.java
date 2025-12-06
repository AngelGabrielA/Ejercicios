public class Auto {
    private double gasolina;

    public Auto(double gasolina){ this.gasolina=gasolina; }
    public boolean conducir(double consumo){
        if(consumo<=gasolina){ gasolina-=consumo; return true; }
        return false;
    }
    public double getGasolina(){ return gasolina; }
}
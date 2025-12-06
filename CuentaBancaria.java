public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular,double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }

    public void depositar(double m){ saldo+=m; }
    public boolean retirar(double m){
        if(m<=saldo){ saldo-=m; return true; }
        return false;
    }
    public double getSaldo(){ return saldo; }
}
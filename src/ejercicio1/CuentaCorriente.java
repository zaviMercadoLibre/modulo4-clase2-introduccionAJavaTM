package ejercicio1;

public class CuentaCorriente {

    private int userId;
    private double saldo;

    public CuentaCorriente(int userId, double saldo) {
        this.userId = userId;
        this.saldo = saldo;
    }
    public CuentaCorriente(CuentaCorriente cuenta)
    {
        this.userId = cuenta.userId;
        this.saldo = cuenta.saldo;
    }
    public void ingreso(double monto)
    {
        setSaldo(this.saldo+monto);
    }

    public void egreso(double monto)
    {
        setSaldo(this.saldo-monto);
    }

    public void reintegro(double monto)
    {
        setSaldo(this.saldo+monto);
    }

    public void transferencia(CuentaCorriente cuenta)
    {
        setSaldo(this.saldo+ cuenta.saldo);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

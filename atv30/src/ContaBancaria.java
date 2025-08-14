public class ContaBancaria {
    private double saldo = 1000;

    public synchronized void sacar(double valor){
        saldo -= valor;
    }

    public synchronized void depositar(double valor){
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

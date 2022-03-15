package questao3;

public class ContaPoupanca extends Conta {

    private int numero;
    private String titular;
    private double saldo;

    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta poupança: "+"\nNúmero: "+numero+"\nNome do titualar: "+titular+"\nSaldo: R$ "+saldo;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String getTitular() {
        return titular;
    }

    @Override
    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double rendimento() {
        return saldo * 0.07;
    }
}

package dev.bustillos.banco;
import dev.bustillos.banco.interfaces.ContaInterface;

public abstract class Conta implements ContaInterface{
    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;
    public double taxaRendimento;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando o valor de R$ " + valor + " na conta " + this.conta);
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Sacando o valor de R$ " + valor + " da conta " + this.conta);
        this.saldo -= valor;
    }

    @Override
    public void transferir(Conta destino, double valor) {
        System.out.println("Transferindo o valor de R$ " + valor + " da conta " + this.conta + " para a conta " + destino.conta);
        this.saldo -= valor;
        destino.saldo += valor;
    }

    @Override
    public void render() {
        System.out.println("Rendendo o saldo da conta " + this.conta);
        this.saldo += this.saldo * this.taxaRendimento;
    }

    @Override
    public void line() {
        for(int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    @Override
    public void line2() {
        System.out.println();
        for(int i = 0; i < 60; i++) {
            System.out.print("#");
        }
        System.out.println();
        System.out.println();
    }

    protected void imprimeExtrato() {
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}

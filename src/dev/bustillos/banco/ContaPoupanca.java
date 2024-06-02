package dev.bustillos.banco;

public class ContaPoupanca extends Conta{
    private static int SEQUENCIAL = 9000;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.agencia = Conta.AGENCIA_PADRAO;
        super.conta = SEQUENCIAL++;
    }
    
    @Override
    public void extrato() {
        super.line();
        System.out.println("Extrato da conta poupança");
        super.imprimeExtrato();
        super.line();
    }
}

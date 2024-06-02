package dev.bustillos.banco;

public class ContaCorrente extends Conta{
    private static int SEQUENCIAL = 1;
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.agencia = Conta.AGENCIA_PADRAO;
        super.conta = SEQUENCIAL++;
    }

    @Override
    public void extrato() {
        super.line();
        System.out.println("Extrato da conta corrente");
        super.imprimeExtrato();
        super.line();
    }
}

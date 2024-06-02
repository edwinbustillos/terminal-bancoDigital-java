package dev.bustillos.banco;

public class Banco {
    public static void main(String[] args) {
        Cliente edwin = new Cliente();
        edwin.setNome("Edwin Bustillos");

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        Conta corrente = new ContaCorrente(edwin);
        Conta poupanca = new ContaPoupanca(maria);
        corrente.line();
        System.out.println("$$$ Banco Bustillos $$$");
        corrente.extrato();
        corrente.depositar(1000);
        corrente.extrato();
        corrente.sacar(500);
        corrente.extrato();
        
        corrente.line2();

        poupanca.line();
        System.out.println("$$$ Banco Bustillos $$$");
        poupanca.extrato();
        poupanca.depositar(12000);
        poupanca.extrato();
        poupanca.sacar(1500);
        poupanca.extrato();
        
        poupanca.line2();

        System.out.println("Lista de clientes do banco:");
        for (Cliente cliente : Cliente.getClientes()) {
            System.out.println(" - " + cliente.getNome());
        }
        System.out.println("Fim da lista de clientes do banco.");
        System.out.println();
    }
}
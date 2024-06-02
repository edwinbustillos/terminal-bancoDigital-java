package dev.bustillos.banco.interfaces;

import dev.bustillos.banco.Conta;

public interface ContaInterface {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(Conta destino, double valor);
    void render();
    void extrato();
    void line();
    void line2();
}

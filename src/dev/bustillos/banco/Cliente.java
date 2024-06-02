package dev.bustillos.banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private static List<Cliente> clientes = new ArrayList<Cliente>(); 
    private String nome;

    public Cliente() {
        clientes.add(this);
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

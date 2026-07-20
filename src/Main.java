package org.example;

public class Main {
    public static void main(String[] args) {

        RH rh = new RH();

        rh.adicionarFuncionario(new FuncionarioCLT("Ana Silva", "Dev Jr", 4000.0));
        rh.adicionarFuncionario(new FuncionarioCLT("Matheus Silva", "Gerente", 20000.0));
        rh.adicionarFuncionario(new FuncionarioPJ("Jorge Pereira", "Dev Sênior", 8000.0));
        rh.adicionarFuncionario(new FuncionarioPJ("Joana Moura", "Arquiteta", 5000.0));

        rh.exibirRelatorio();
    }
}
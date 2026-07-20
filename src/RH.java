package org.example;

import java.util.ArrayList;
import java.util.List;

public class RH {
    private List<Funcionario> funcionarios;

    public RH() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void exibirRelatorio() {
        for (Funcionario f : funcionarios) {
            if(f instanceof Relatorio r) {
                System.out.println(r.gerarHolerite());
            }
        }
    }
}

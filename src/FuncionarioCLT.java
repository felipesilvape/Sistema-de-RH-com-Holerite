package org.example;

public class FuncionarioCLT extends Funcionario implements Relatorio {
    public FuncionarioCLT(String name, String cargo, double salarioBase) {
        super(name, cargo, salarioBase);
    }

    @Override
    public double calcularDesconto() {
        return 0.11 * getSalarioBase();
    }

    @Override
    public String gerarHolerite() {
        double salarioLiquido = getSalarioBase() - calcularDesconto();
        return "[CLT] " + getName() + " - " + getCargo() + " - Salário Líquido: R$" + salarioLiquido + "\n";
    }
}

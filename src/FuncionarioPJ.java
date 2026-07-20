package org.example;

public class FuncionarioPJ extends Funcionario implements Relatorio {
    public FuncionarioPJ(String name, String cargo, double salarioBase) {
        super(name, cargo, salarioBase);
    }

    @Override
    public double calcularDesconto() {
        return 0.06 * getSalarioBase();
    }

    @Override
    public String gerarHolerite() {
        double salarioLiquido = getSalarioBase() - calcularDesconto();
        return "[PJ] " + getName() + " - " + getCargo() + " - Salário Líquido: R$ " + salarioLiquido + "\n";
    }
}

package org.example;

public abstract class Funcionario {
    private String name;
    private String cargo;
    private double salarioBase;

    public Funcionario(String name, String cargo, double salarioBase) {
        this.name = name;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularDesconto();

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}

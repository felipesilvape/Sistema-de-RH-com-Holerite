# Sistema de RH com Holerite

Projeto de estudo de Java OOP demonstrando herança, classes abstratas, interfaces e polimorfismo através de um sistema de folha de pagamento com dois tipos de contrato.

## Conceitos aplicados

- Classe abstrata (`Funcionario`)
- Herança (`FuncionarioCLT` e `FuncionarioPJ` estendendo `Funcionario`)
- Interface (`Relatorio`)
- Polimorfismo (lista de funcionários misturados processada uniformemente)
- Encapsulamento (atributos `private` com getters e setters)

## Estrutura do projeto

```
src/
└── org.example/
    ├── Funcionario.java        # Classe abstrata base
    ├── FuncionarioCLT.java     # Herda Funcionario, desconto de 11% (INSS)
    ├── FuncionarioPJ.java      # Herda Funcionario, desconto de 6% (ISS)
    ├── Relatorio.java          # Interface com gerarHolerite()
    ├── RH.java                 # Gerencia lista de funcionários e exibe holerites
    └── Main.java               # Ponto de entrada
```

## Como executar

**Pré-requisitos:** JDK 21+, Maven

```bash
git clone https://github.com/seu-usuario/sistema-rh.git
cd sistema-rh
mvn compile exec:java -Dexec.mainClass="org.example.Main"
```

## Exemplo de saída

```
[CLT] Ana Silva - Dev Jr - Salário Líquido: R$ 3560.0
[CLT] Matheus Silva - Gerente - Salário Líquido: R$ 17800.0
[PJ] Jorge Pereira - Dev Sênior - Salário Líquido: R$ 7520.0
[PJ] Joana Moura - Arquiteta - Salário Líquido: R$ 4700.0
```

## Regras de negócio

| Tipo de contrato | Desconto | Base de cálculo  |
|------------------|----------|------------------|
| CLT              | 11%      | Salário base     |
| PJ               | 6%       | Salário base     |

O salário líquido é calculado como `salarioBase - calcularDesconto()`.

## Aprendizados

Este projeto foi desenvolvido como exercício do Dia 1 de um plano de estudos Java com foco em estágio backend. É uma evolução do projeto de veículos, aplicando os mesmos pilares de OOP em um contexto diferente para consolidar o aprendizado.

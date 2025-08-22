# Atividade 1 – Revisão de Programação Orientada a Objetos

Este projeto é um **Sistema de Gestão de Funcionários** desenvolvido em Java, criado para gerenciar colaboradores de uma empresa. Ele permite cadastrar diferentes tipos de funcionários e calcular bônus de acordo com o cargo.
<img width="880" height="266" alt="image" src="https://github.com/user-attachments/assets/5f68de0d-3ac2-4870-9862-93d636b5a1d3" />

## Funcionalidades

- Cadastro de funcionários, gerentes e estagiários.
- Cálculo de bônus:
    - Funcionário: 10% do salário
    - Gerente: 10% do salário + bônus extra
    - Estagiário: bônus fixo de R$300
- Exibição das informações de cada colaborador (nome, salário, bônus, salário total).
- Uso de herança, polimorfismo e interfaces para organizar o código.

## Tecnologias e conceitos usados

- Java
- Classes abstratas (`Pessoa`)
- Herança (`Funcionario`, `Gerente`, `Estagiario`)
- Interface (`Bonificacao`)
- Encapsulamento (getters e setters)
- Polimorfismo (sobrescrita de métodos)
- Arrays e loop `for-each` para manipulação de funcionários

## Como usar

1. Compile e execute a classe `Main`.
2. O programa cria automaticamente alguns funcionários, gerentes e estagiários.
3. As informações de cada colaborador são exibidas no console.

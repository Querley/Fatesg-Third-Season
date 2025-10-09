# A01-N2 Sistema de Cadastro de Produtos (MVC)

Este repositório contém um sistema simples de **cadastro de produtos**, desenvolvido em **Java** utilizando o padrão **MVC (Model–View–Controller)**.  
O sistema permite cadastrar, listar, exibir detalhes e excluir produtos, mantendo a separação entre as camadas de dados, interface e controle.

add image here.
---

## Estrutura do Projeto

### Pacotes e Classes

**model**

- `Produto`
    - Atributos: `nome`, `preço`, `quantidade`
    - Responsável por representar o produto e armazenar seus dados.

**view**

- `ProdutoView`
    - Responsável por interagir com o usuário via console.
    - Exibe mensagens e solicita as informações necessárias.

**controller**

- `ProdutoController`
    - Controla o fluxo do sistema.
    - Cria e gerencia os objetos `Produto`.
    - Solicita à `View` que exiba mensagens e listas de produtos.
    - Implementa funcionalidades de cadastro, listagem, detalhes e exclusão.

**Main**

- Classe principal do sistema.
- Exibe o menu principal e executa as ações conforme a escolha do usuário.

---

## Funcionalidades

- Cadastrar produto (nome, preço e quantidade)
- Listar todos os produtos cadastrados
- Exibir detalhes de um produto
- Excluir produto pelo nome
- Mostrar mensagens e resultados via console

---


# Projeto Loja de Produtos

Este projeto é uma aplicação simples de uma loja que vende diferentes tipos de produtos. A loja suporta promoções que podem ser aplicadas aos produtos para dar descontos.

## Classes e Interfaces

O projeto contém as seguintes classes e interfaces:

- `Produto`: Esta é a classe base para todos os produtos. Ela contém atributos como marca, modelo, preço e tipo de tela.

- `Televisao`, `Smartphone` e `Notebook`: Estas classes herdam da classe `Produto` e adicionam atributos específicos para cada tipo de produto.

- `Descontavel`: Esta é uma interface que define um método `aplicarDesconto()`. As classes que implementam esta interface podem ter descontos aplicados.

- `PromocaoDescontoPorcentagem` e `PromocaoDescontoFixo`: Estas classes implementam a interface `Descontavel` e definem como aplicar um desconto percentual ou fixo, respectivamente.

- `Loja`: Esta classe contém uma lista de produtos e promoções. Ela tem métodos para cadastrar produtos, listar produtos, buscar produtos, adicionar promoções e calcular o total da compra.

## Executando a Aplicação

A aplicação pode ser executada através da classe `LojaApp`. Esta classe contém um menu interativo que permite ao usuário escolher entre diferentes opções para interagir com a loja.

## Licença

Este projeto está licenciado sob a licença MIT.

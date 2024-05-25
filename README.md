---

# Desafio de Projeto: Controle de Fluxo em Java

Este projeto consiste em um desafio de programação em Java que visa exercitar o conhecimento sobre controle de fluxo utilizando estruturas de decisão e de repetição.

## Descrição do Desafio

O objetivo deste desafio é criar um programa em Java que recebe dois números inteiros como entrada do usuário via terminal e, em seguida, imprime os números incrementados no console. O programa também deve validar se o segundo número é maior que o primeiro e, se não for, lançar uma exceção personalizada.

### Funcionalidades Principais:

- Solicitar ao usuário dois números inteiros via terminal.
- Validar se o segundo número é maior que o primeiro.
- Imprimir os números incrementados no intervalo entre os dois números fornecidos.

## Como Executar o Programa

1. Certifique-se de ter o ambiente de desenvolvimento Java configurado em sua máquina.
2. Clone este repositório para sua máquina local.
3. Abra o terminal e navegue até o diretório do projeto.
4. Compile o programa usando o comando `javac Contador.java ParametrosInvalidosException.java`.
5. Execute o programa com o comando `java Contador`.
6. Siga as instruções exibidas no terminal para fornecer os números inteiros.

## Exceção Personalizada

Neste projeto, foi implementada uma exceção personalizada chamada `ParametrosInvalidosException`, que é lançada quando o segundo número fornecido pelo usuário é menor ou igual ao primeiro.

---
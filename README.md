# Tela de Login

Este é um sistema simples de login desenvolvido em Java utilizando a biblioteca Swing. Ele consiste em uma interface gráfica de usuário (GUI) com campos de entrada para nome de usuário e senha, bem como botões para entrar e sair.

## Funcionalidades

- **Entrar:** Verifica se o nome de usuário e a senha inseridos correspondem aos valores esperados. Se a senha for "1234", o usuário é redirecionado para a tela inicial.
- **Sair:** Fecha a janela de login.

## Estrutura do Código

O código está dividido em três classes principais:

### TelaLogin

Esta classe define a interface gráfica de login. Ela inclui campos de texto para o nome de usuário e senha, bem como botões para entrar e sair.

### TelaInicial

Esta classe representa a tela inicial do sistema após o login bem-sucedido. Ela exibe uma mensagem de boas-vindas ao usuário e oferece opções para realizar diferentes ações.

### TelaCadastro

Esta classe implementa a funcionalidade de cadastro de disciplinas. Ela permite que o usuário insira o nome da disciplina, nome do professor, número de horas e semestre.

## Lista de Disciplinas

Existe também a classe `Disciplina` que modela as informações de uma disciplina. Além disso, há uma classe `ListaDeDisciplinas` que gerencia uma lista de disciplinas, permitindo adicionar, remover, alterar e obter informações sobre as disciplinas cadastradas.

## Como Executar

Para executar o sistema, basta compilar os arquivos Java e iniciar a classe `TelaLogin`. Uma vez em execução, você poderá utilizar as funcionalidades de login e cadastro de disciplinas.

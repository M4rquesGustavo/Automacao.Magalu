#language: en


Feature: Cadastro de usuário - Cenários Negativos

  Background:
    Given que estou na tela inicial
    When clico no botão de criar conta
    And digito meu email e clico em criar conta

  Scenario: Tentar cadastrar com CPF inválido
    And preencho os dados pessoais com cpf inválido
    And preencho o endereço
    And aceito os termos
    And clico em continuar
    Then deve ser exibida mensagem de cpf inválido

  Scenario: Tentar cadastrar com senha fraca
    And preencho os dados pessoais com senha inválida
    And preencho o endereço
    And aceito os termos
    And clico em continuar
    Then deve ser exibida mensagem de senha inválida

  Scenario: Tentar cadastrar com CEP inválido
    And preencho os dados pessoais
    And preencho o endereço com cep inválido
    Then deve ser exibida mensagem de cep inválido
#lenguage = pt

Feature: Cadastro de usuário

  Background:
    Given que estou na tela inicial

  Scenario: Realizar cadastro com sucesso
    When clico no botão de criar conta
    And digito meu email
    And clico em criar conta
    And preencho os dados pessoais
    And preencho o endereço
    And aceito os termos
    Then o cadastro deve ser realaizado com sucesso
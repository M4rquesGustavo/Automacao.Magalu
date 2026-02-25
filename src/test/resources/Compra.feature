# lengague: pt
  Feature: Compra e Cadastro

    Background:
      Given que estou na tela inicial

  Scenario: comprar um produto
    When pesquiso um produto
    And seleciono um produto
    And clico em comprar e aceito a garantia recomendada
    And digito meu email
    And clico em criar conta
    And preencho os dados pessoais
    And preencho o endereço
    And aceito os termos
    Then o cadastro deve ser realaizado com sucesso
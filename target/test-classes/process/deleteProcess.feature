Feature: Delete process

  Background:
    Given user access to Agapito Page
    And user clicks on new process button
    And user informs "vara" with value equal "teste"
    And user informs "numero_processo" with value equal "23"
    And user informs "natureza" with value equal "divorcio"
    And user informs "partes" with value equal "Augusto x Aline"
    And user informs "urgente" with value equal "S"
    And user informs "arbitramento" with value equal "S"
    And user informs "assistente_social" with value equal "Regina"
    And user informs "data_entrada" with value equal "2019-10-20"
    And user informs "data_saida" with value equal ""
    And user informs "data_agendamento" with value equal ""
    And user informs "status" with value equal "Aguardando"
    And user informs "observacao" with value equal ""
    And user informs "numero_processo" with value equal "23"


  Scenario: Delete a simple process
    Given user clicks on save button
    When user clicks on delete button
    Then user should see "no content" message
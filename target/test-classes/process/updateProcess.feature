Feature: Update a process

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
    And user clicks on save button

  Scenario: Update a simple process
    Given user update "vara" with value "2308"
    When user clicks on update button
    Then user should see "success" message

  Scenario: Update a simple process and compare
    Given user update "vara" with value "2310"
    And user clicks on update button
    When user reads the last update
    Then user should be "vara" with value "2310"
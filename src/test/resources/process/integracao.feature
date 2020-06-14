Feature: read a process

  Scenario: GET - Read a simple process
    Given the user has an existent id equal "value"
    When the user clicks on read process button
    Then users should see "success" message

  Scenario Outline: POST - Create a new process
    Given user access to Agapito Page
    And user clicks on new process button
    And user informs "<field>" with value equal "<value>"
    And user informs "<field1>" with value equal "<value1>"
    And user informs "<field2>" with value equal "<value2>"
    And user informs "<field3>" with value equal "<value3>"
    And user informs "<field4>" with value equal "<value4>"
    And user informs "<field5>" with value equal "<value4>"
    And user informs "<field6>" with value equal "<value5>"
    And user informs "<field7>" with value equal "<value6>"
    And user informs "<field8>" with value equal "<value7>"
    And user informs "<field9>" with value equal "<value7>"
    And user informs "<field10>" with value equal "<value8>"
    And user informs "<field11>" with value equal "<value7>"
    And user informs "<field1>" with value equal "<value1>"
    When user clicks on save button
    Then user should see "<type>" message
    When the user searches for the last saved process
    Then the user should see in the field "<field1>" the value "<value1>"
    Examples:
      | field | value | field1          | value1 | field2   | value2   | field3 | value3          | field4  | value4 | field5       | field6            | value5 | field7       | value6     | field8     | value7 | field9           | field10 | value8     | field11    | type              |
      | vara  | 11111 | numero_processo | 23     | natureza | divorcio | partes | Augusto x Aline | urgente | S      | arbitramento | assistente_social | Regina | data_entrada | 2019-10-20 | data_saida |        | data_agendamento | status  | Aguardando | observacao | save with success |

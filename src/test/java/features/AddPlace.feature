Feature: Validate the add place

  Scenario Outline: : Validate add place api is working or not
    Given Api Json body with "<name>" "<language>" "<address>"
    When hit Post API with the body
    And prepare Post data
    Then Validate the resonse body status code is "200"
    Then "status" of the resposnse is "OK"
    And "scope" of the resposnse is "APP"

    Examples: 
      | name    | language | address                                       |
      | Sunil   | Telugu   | Sri SaiBaba Street, IND, ONG                  |
      | Anil    | English  | Sri Shiva Street, IND, ONG                    |
      | Gunil   | Telugu   | Sri Ramana manharshi Street, IND, Arunachalam |
      | Sirisha | French   | Sri Ramana manharshi Street, IND, Arunachalam |

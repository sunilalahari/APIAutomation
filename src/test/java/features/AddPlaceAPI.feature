Feature: Validate the Add API to insert the data

Scenario Outline:
:the Verififaction of the Add API to insert the data
Given Add Place Payload with "<name>" "<language>" "<address>"
When user calls "AddPlaceAPI" with "Post" https request
Then "status" of the response is "OK"
And "scope" of the response is "APP"


Examples: 
      | name    | language | address                                       |
      | Sunil   | Telugu   | Sri SaiBaba Street, IND, ONG                  |
      | Lord SHiva    | Sanskrit  | Sri Shiva Street, IND, ONG                    |
      
Scenario: The Verififaction of the GET API to insert the data
Given Get Place API preperation
When user calls "GetPlaceAPI" with "Get" https request
Feature: Phone number purchase
    Scenario Outline:  Call Recording Free Trial feature
        Given I Am on avoxi website phone number selection page
        When  I select a "<country>","<numberType>","<number>"
        And   I select a "<plan>"
        #And   select add on "<features>"
        And   complete information "<firstname>","<lastname>","<businessname>","<businessemail>" and click continue
        Then  I can enter a valid test credit card Payment "<nameoncard>","<cnumber>","<expiry>","<cvv>"  and I accept the terms
        And   Successfully Place the order
        Examples: new phone number
          | country                 |numberType             |number             |plan          |features        |firstname|lastname|businessname|businessemail |nameoncard|cnumber         |expiry   |cvv|
          | United States of America|Georgia, Atlanta 470   |14044917591        |STANDARD      |Call Recording  |john        |doe      |avoxi           |jdoe@d.com       |john doe  |4111111111111111|01/21    |128|


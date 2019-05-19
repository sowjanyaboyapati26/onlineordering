Feature: Phone number purchase

    Scenario:  Call Recording Free Trial feature
        Given: I Am on avoxi website phone number selection page
        When: I select a "<country>","<areacode>","<phonenumber>"
        And: I select a "<plan>"
        And: select add on "<features>"
        And: complete information and click continue
        Then: I can enter a valid test credit card Payment method and I accept the terms
        And: Successfully Place the order

        Examples: new phone number
          | country                 |areacode             |phonenumber         |plan          |features        |           |
          | United States of America|Georgia, Atlanta 404 |14044917555         |STANDARD      |Call Recording  |


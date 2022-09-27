Feature: Quotes feature testing


  Scenario Outline:
  To valiate whether user is able to land successfully in Quotes screen upon providing valid details
    Given User landed into the Application
    When User inputs the Registration number of the vehicle "<Registration_Number>"
    When User click on Get Quotes button
    Then User lands in Choose your vehicle screen
    When User edits the expiry date to plus 5 days
    When User click on PROCEED button
    When User chooses "<Claim_Status>" as Claimed Status
    When User chooses "<Ownership_Change>" as Ownership change Status
    When User chooses "<NCB>" in No Claim Bonus dropdown
    When User click on SUBMIT button
    Then User lands in Quotes page successfully
    And User validates results Quotes are displayed

    Examples:
      | Registration_Number | Claim_Status | Ownership_Change | NCB |
      | MH-30-AS-4668	    | No 		 | No			  | 20% |
		#		| UP-32-DV-1480	    | No 		 | No			  |  0% |
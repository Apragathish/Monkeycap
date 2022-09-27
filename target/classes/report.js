$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/Monkey_Cap/features/TestCases.feature");
formatter.feature({
  "line": 1,
  "name": "Quotes feature testing",
  "description": "",
  "id": "quotes-feature-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "To valiate whether user is able to land successfully in Quotes screen upon providing valid details",
  "id": "quotes-feature-testing;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User landed into the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User inputs the Registration number of the vehicle \"\u003cRegistration_Number\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on Get Quotes button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User lands in Choose your vehicle screen",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User edits the expiry date to plus 5 days",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User click on PROCEED button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User chooses \"\u003cClaim_Status\u003e\" as Claimed Status",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User chooses \"\u003cOwnership_Change\u003e\" as Ownership change Status",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User chooses \"\u003cNCB\u003e\" in No Claim Bonus dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click on SUBMIT button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User lands in Quotes page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User validates results Quotes are displayed",
  "keyword": "And "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "quotes-feature-testing;;",
  "rows": [
    {
      "cells": [
        "Registration_Number",
        "Claim_Status",
        "Ownership_Change",
        "NCB"
      ],
      "line": 19,
      "id": "quotes-feature-testing;;;1"
    },
    {
      "cells": [
        "TN-05-AD-0993",
        "No",
        "No",
        "20%"
      ],
      "line": 20,
      "id": "quotes-feature-testing;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "To valiate whether user is able to land successfully in Quotes screen upon providing valid details",
  "id": "quotes-feature-testing;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User landed into the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User inputs the Registration number of the vehicle \"TN-05-AD-0993\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on Get Quotes button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User lands in Choose your vehicle screen",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User edits the expiry date to plus 5 days",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User click on PROCEED button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User chooses \"No\" as Claimed Status",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User chooses \"No\" as Ownership change Status",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User chooses \"20%\" in No Claim Bonus dropdown",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click on SUBMIT button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User lands in Quotes page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User validates results Quotes are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage.user_landed_into_the_Application()"
});
formatter.result({
  "duration": 462213500,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.Monkey_Cap.stepDefinitions.Homepage.user_landed_into_the_Application(Homepage.java:17)\r\n\tat ✽.Given User landed into the Application(src/test/java/com/Monkey_Cap/features/TestCases.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "TN-05-AD-0993",
      "offset": 52
    }
  ],
  "location": "Homepage.user_inputs_the_Registration_number_of_the_vehicle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Homepage.user_click_on_Get_Quotes_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Vehicle_Details.user_lands_in_Choose_your_vehicle_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 35
    }
  ],
  "location": "Vehicle_Details.user_edits_the_expiry_date_to_plus_days(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Vehicle_Details.user_click_on_PROCEED_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "No",
      "offset": 14
    }
  ],
  "location": "StatusOption.user_chooses_as_Claimed_Status(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "No",
      "offset": 14
    }
  ],
  "location": "StatusOption.user_chooses_as_Ownership_change_Status(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "20%",
      "offset": 14
    }
  ],
  "location": "StatusOption.user_chooses_in_No_Claim_Bonus_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StatusOption.user_click_on_SUBMIT_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Quotes.user_lands_in_Quotes_page_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Quotes.user_validates_results_Quotes_are_displayed()"
});
formatter.result({
  "status": "skipped"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/GmailTest/src/main/java/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Gmail Page Feature",
  "description": "",
  "id": "login-gmail-page-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Gmail Login",
  "description": "",
  "id": "login-gmail-page-feature;gmail-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have launched Gmail",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter username and password and I click login button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should be in the gmail inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_have_launched_Gmail()"
});
formatter.result({
  "duration": 38997583413,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_enter_username_and_password_and_I_click_login_button()"
});
formatter.result({
  "duration": 6173724839,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_should_be_in_the_gmail_inbox()"
});
formatter.result({
  "duration": 17158982067,
  "error_message": "java.lang.NullPointerException\r\n\tat pages.LoginPage.verifyInbox(LoginPage.java:51)\r\n\tat stepdefinition.StepDefinition.i_should_be_in_the_gmail_inbox(StepDefinition.java:59)\r\n\tat ✽.Then I should be in the gmail inbox(E:/GmailTest/src/main/java/feature/login.feature:6)\r\n",
  "status": "failed"
});
});
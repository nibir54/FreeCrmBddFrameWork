$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Free Crm",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LogInStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 10024803365,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefinition.title_of_login_page_is_free_Crm()"
});
formatter.result({
  "duration": 45440866,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 822009892,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 2488634308,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 43526219,
  "status": "passed"
});
});
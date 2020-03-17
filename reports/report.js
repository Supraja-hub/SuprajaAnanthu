$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/login.feature");
formatter.feature({
  "name": "Login",
  "description": "In order to buy something\nAs a customer\nI want to get access to the portal",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with demoblaze page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Valid Signup",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter username as \u0027ananthusupraja7@gmail.com\u0027 and password as \u0027supraja@403\u0027",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should get popup as \u0027Sign up successful\u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/inlogkennisavond.feature");
formatter.feature({
  "name": "sddcsdfsdfsdf",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regressie"
    }
  ]
});
formatter.step({
  "name": "the browser is opened and showing the intranet homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Inloggen_stepdefinition.setUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs on with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "Inloggen_stepdefinition.loginfeature_validcredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Inloggen_stepdefinition.loginfeature_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the homepage is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Inloggen_stepdefinition.loginfeature_homepagedisplayed()"
});
formatter.result({
  "status": "passed"
});
});
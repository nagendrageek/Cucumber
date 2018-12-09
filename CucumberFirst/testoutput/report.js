$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verification of Login transcations",
  "description": "",
  "id": "application-login;verification-of-login-transcations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User cliked on submit button by providing userid and password",
  "rows": [
    {
      "cells": [
        "nagendrab493",
        "jahnavi493"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Application Home Page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "able to do another transcation from this screen",
  "keyword": "And "
});
formatter.match({
  "location": "gmail.login_page()"
});
formatter.result({
  "duration": 9266634051,
  "status": "passed"
});
formatter.match({
  "location": "gmail.user_cliked_on_submit_button_by_providing_and(DataTable)"
});
formatter.result({
  "duration": 2063646114,
  "status": "passed"
});
formatter.match({
  "location": "gmail.application_home_page_is_displayed()"
});
formatter.result({
  "duration": 6975247356,
  "status": "passed"
});
formatter.match({
  "location": "gmail.able_to_do_another_transcation_from_this_screen()"
});
formatter.result({
  "duration": 2122942982,
  "status": "passed"
});
});
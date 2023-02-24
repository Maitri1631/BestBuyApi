$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Menu.feature");
formatter.feature({
  "line": 1,
  "name": "Add to cart",
  "description": "As a user I want to add to cart product successfully",
  "id": "add-to-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8478697500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should Add to cart product successfully",
  "description": "",
  "id": "add-to-cart;user-should-add-to-cart-product-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Click on top menu \"Top menu\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on sub menu \"Sub Menu\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MenuStep.iAmOnHomePage()"
});
formatter.result({
  "duration": 90620900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Top menu",
      "offset": 21
    }
  ],
  "location": "MenuStep.iClickOnTopMenu(String)"
});
formatter.result({
  "duration": 379006700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sub Menu",
      "offset": 21
    }
  ],
  "location": "MenuStep.iClickOnSubMenu(String)"
});
formatter.result({
  "duration": 102815200,
  "status": "passed"
});
formatter.after({
  "duration": 627675700,
  "status": "passed"
});
});
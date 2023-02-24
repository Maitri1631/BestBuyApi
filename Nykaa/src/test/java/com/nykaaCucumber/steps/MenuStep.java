package com.nykaaCucumber.steps;

import com.nykaaCucumber.Hooks;
import com.nykaaCucumber.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MenuStep {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }


    @And("^I Click on top menu \"([^\"]*)\"$")
    public void iClickOnTopMenu(String tab)  {
      new HomePage().ClickonTopmenu(tab);
    }

    @Then("^I click on sub menu \"([^\"]*)\"$")
    public void iClickOnSubMenu(String tB){
      new HomePage().ClickonSubmenu(tB);
    }
}

package com.TA.steps.shopping;

import com.google.gson.JsonObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.Text;
import ui.com.TA.shopping.Methods.String2Int;
import ui.com.TA.shopping.models.UserCardParameters;
import ui.com.TA.shopping.tasks.*;
import ui.com.TA.shopping.user_interfaces.Shopper_Page;
import ui.com.TA.shopping.user_interfaces.Success_page;

import java.util.ArrayList;
import java.util.List;

import static indexed.pojo.model.IndexedPojoDeserializer.deserializeJsonTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class shopping {
    UserCardParameters userParameters= new UserCardParameters();
    String2Int Obj=new String2Int();
    int val,val1,Temp;
    List<String> Price_Aloe=new ArrayList<String>();
    List<Integer> price_aloe=new ArrayList<Integer>();
    List<String> Price_Almond=new ArrayList<String>();
    List<Integer> price_almond=new ArrayList<Integer>();
    String temperature,title;

    @Given("user is on weather shopper page")
    public void UserIsOnTheWeatherPage(){
        theActorInTheSpotlight().attemptsTo(Open.url("https://weathershopper.pythonanywhere.com/"));
    }

    @And("user checks temperature")
    public void userChecksTemperature() {
        this.temperature= Text.of(Shopper_Page.TEMPERATURE).asString().answeredBy(theActorInTheSpotlight());
        Temp=Obj.convertStringToInt(temperature);
    }

    @When("user navigates to items page")
    public void userNavigatesToItemsPage() {
        theActorInTheSpotlight().attemptsTo(ItemPageNavigation.using(Temp));

    }

    @When("user selects items")
    public void userSelectsItems() {
        theActorInTheSpotlight().attemptsTo(ItemsSelection.using());
    }

    @And("click carts")
    public void clickCarts() {
        theActorInTheSpotlight().attemptsTo(
                ClickCarts.using()
        );
    }

    @Then("verify user is on checkout page")
    public void verifyUserIsOnCheckoutPage() {
        theActorInTheSpotlight().attemptsTo(
                VerifyUserOnCheckOutPage.using()
        );
    }

    @And("user verifies item details")
    public void userVerifiesItemDetails() {
        theActorInTheSpotlight().attemptsTo(ItemsPickedVerify.using());
    }

    @And("user pays with card")
    public void userPaysWithCard() {
        theActorInTheSpotlight().attemptsTo(
                PayWithCard.using()
        );
    }

    @When("user enters account credentials {jsonTestData}")
    public void inputDetails(JsonObject parameters){
        userParameters = deserializeJsonTo(parameters, UserCardParameters.class);
        theActorInTheSpotlight().attemptsTo(EnterUserDetails.using(userParameters));
    }
    @Then("payment should be successful")
    public void paymentShouldBeSuccessful() {
        theActorInTheSpotlight().attemptsTo(
                VerifyPaymentSuccessfull.using()
        );
        theActorInTheSpotlight().should(seeThat(the(Success_page.SUCCESS), isPresent()));
    }
}

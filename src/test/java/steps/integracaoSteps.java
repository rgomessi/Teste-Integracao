package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import definition.Processo;
import org.junit.Assert;
import support.RESTSupport;

public class integracaoSteps {
    @Given("^the user has an existent id equal \"([^\"]*)\"$")
    public void theUserHasAnExistentIdEqual(String id) throws Throwable {
    Processo.setLastId(id);
    }

    @When("^the user clicks on read process button$")
    public void theUserClicksOnReadProcessButton() {
        String url = Processo.geturl() + "/" + Processo.getLastId();
        RESTSupport.executeGet(Processo.geturl());
    }

    @Then("^users should see \"([^\"]*)\" message$")
    public void usersShouldSeeMessage(String id) throws Throwable {
    }

    @Given("^user access to Agapito Page$")
    public void userAcessToAgapitoPage() {
        Processo.clearfields();
    }

    @And("^user clicks on new process button$")
    public void userClicksOnNewProcessButton() {

 }

    @And("^user informs \"([^\"]*)\" with value equal \"([^\"]*)\"$")
    public void userInformsWithValueEqual(String field, String value) throws Throwable {
      Processo.addFields(field,value);
    }

    @When("^user clicks on save button$")
    public void userClicksOnSaveButton() {
        RESTSupport.executePost(Processo.geturl(),Processo.getFields());
        Processo.setLastId(RESTSupport.key("id").toString());
    }

    @When("^the user searches for the last saved process$")
    public void theUserSearchesForTheLastSavedProcess() {
        RESTSupport.executeGet(Processo.geturl() + "/" + Processo.getLastId());
    }

    @Then("^the user should see in the field \"([^\"]*)\" the value \"([^\"]*)\"$")
    public void theUserShouldSeeInTheFieldTheValue(String field, String value) throws Throwable {
        Assert.assertEquals(value, RESTSupport.key(field).toString());
    }

    @And("^user update \"([^\"]*)\" with value \"([^\"]*)\"$")
    public void userUpdateWithValue(String field, String value) throws Throwable {
        Processo.addFields(field, value);
    }

    @When("^user clicks on update button$")
    public void userClicksOnUpdateButton() {
        String url = Processo.geturl() + "/" + Processo.getLastId();
        RESTSupport.executePut(url, Processo.getFields());

    }

    @When("^user reads the last update$")
    public void userReadsTheLastUpdate() {
        String url = Processo.geturl() + "/" + Processo.getLastId();
        RESTSupport.executeGet(url);
    }

    @Then("^user should be \"([^\"]*)\" with value \"([^\"]*)\"$")
    public void userShouldBeWithValue(String field, String value) throws Throwable {
    Assert.assertEquals(value, RESTSupport.key(field).toString());
    }

    @When("^user clicks on delete button$")
    public void userClicksOnDeleteButton() {
        String url = Processo.geturl() + "/" + Processo.getLastId();
        RESTSupport.executeDelete(url);
    }
}

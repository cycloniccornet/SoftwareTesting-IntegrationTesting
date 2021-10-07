package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

public class ReadDataStepdefinition {

    File dummyFile = new File("C://Users//patr5//IdeaProjects//Software Testing - Integration testing persitant//src//main//resources//DummyData.csv");
    FileManager fileManager;

    private String dataFromFile;


    @Given("I have a file named DummyData.csv")
    public void i_have_a_file_named_dummy_data_csv() {
        boolean exists = dummyFile.exists();
        assertTrue(exists);
    }

    @When("data is requested")
    public void data_is_requested() throws IOException {
        fileManager = new FileManager();
        dataFromFile = fileManager.fetchAllData();
    }

    @Then("I will recieve all the data:")
    public void i_will_recieve_all_the_data() {
        assertEquals("somedata", dataFromFile);
    }
}

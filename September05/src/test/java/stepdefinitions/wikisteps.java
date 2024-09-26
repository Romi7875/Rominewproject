package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikisteps {
    WebDriver driver;
    @Given("user navigates to wiki homepage")
    public void wikiHome(){
         driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Infosys");

    }

    @When("user extracts the shareholder value")
    public void userExtractsTheShareholderValue() {
        int size = driver.findElements(By.xpath("//table[@class = 'wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();

        for (int k=0; k < size; k++){
     String shareholdervalue =  driver.findElements(By.xpath("//table[@class = 'wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(k).getText();
            System.out.println(shareholdervalue);
        }



    }

    @And("user extracts the shareholding value")
    public void userExtractsTheShareholdingValue() {
        int s = driver.findElements(By.xpath("//table[@class = 'wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
        for (int d=0; d < s; d++ ) {
            String shareHoldingvalue = driver.findElements(By.xpath("//table[@class = 'wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(d).getText();
            System.out.println(shareHoldingvalue);
        }

        int Acqsize = driver.findElements(By.xpath("//table[@class='wikitable']/descendant::tr/child::td[5]")).size();
        for (int i = 0; i< Acqsize; i++){
            String acqvalue = driver.findElements(By.xpath("//table[@class='wikitable']/descendant::tr/child::td[5]")).get(i).getText();
            System.out.println(acqvalue);
        }
    }

    @Then("validate the mapping")
    public void validateTheMapping() {

    }
}

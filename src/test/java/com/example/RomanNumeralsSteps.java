package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RomanNumeralsSteps {

    private final RomanNumerals romanNumerals = new RomanNumerals();
    private int number;
    private String result;

    @Given("the integer {int}")
    public void theInteger(int number) {
        this.number = number;
    }

    @When("I convert it to a Roman numeral")
    public void iConvertItToARomanNumeral() {
        result = romanNumerals.convert(number);
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String expected) {
        assertEquals(expected, result);
    }
}

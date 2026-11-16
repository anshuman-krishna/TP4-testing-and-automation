package com.example;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectFile;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectFile("src/test/java/com/example/roman_numerals.feature")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example")
public class RunCucumberTest {
}

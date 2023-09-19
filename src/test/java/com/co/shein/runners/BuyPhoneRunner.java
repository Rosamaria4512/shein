package com.co.shein.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buyPhone.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.shein.stepsdefinitions",
        plugin = "pretty"
)
public class BuyPhoneRunner {

}

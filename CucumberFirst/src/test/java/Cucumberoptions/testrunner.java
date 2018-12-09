package Cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\nagen\\git\\Cucumber\\CucumberFirst\\src\\test\\java\\Features\\login.feature",
 				  glue="stepDefinations",
 				  dryRun=false,
 				  strict=true,
 				  format= {"pretty", "html:testoutput", "json:json-output/Ja.json", "junit:xmlouput/test.xml"},
 				  monochrome=true
 				  
		
		)
public class testrunner {

}

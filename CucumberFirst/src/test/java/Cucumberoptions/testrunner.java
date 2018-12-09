package Cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\nagen\\eclipse-workspace\\CucumberFirst\\src\\test\\java\\Features",
 				  glue="stepDefinations",
 				  dryRun=false,
 				  strict=true,
 				  format= {"pretty", "html:testoutput", "json:json-output/Ja.json", "junit:xmlouput/test.xml"},
 				  monochrome=true
 				  
		
		)
public class testrunner {

}

package org.example.testRunner;



import io.cucumber.testng.CucumberOptions;

import org.example.stepDefs.Hooks;


@CucumberOptions(features = "src/main/features",
        glue = {"org/example/stepDefs"},
        plugin = {"pretty","html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@smoke")
public class runners extends Hooks {

}


import io.cucumber.testng.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;
import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@CucumberOptions(
        tags= "@smokeTest or @smokeTest1",
        features="src\\main\\resources",
        glue = {"steps","hooks"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports-testng/cucumber-reports.html",
                "json:target/cucumber-reports-testng/cucumber.json"
        },
        monochrome = false

)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void beforeMethod(){
        System.out.println("before This suite");
    }
    @AfterClass
    public void afterMethod(){
        System.out.println("after this suite");


    }
    @AfterSuite
    public void afterSuite(){
        generateReport();
    }
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }


    private void generateReport() {
        Configuration configuration = new Configuration(new File("target/cucumber-reports-testng"), "Suite name");
        configuration.setSortingMethod(SortingMethod.NATURAL);
        configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
        configuration.setBuildNumber("1");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber-reports-testng/cucumber.json");
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();

    }
}
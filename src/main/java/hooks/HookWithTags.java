package hooks;

import io.cucumber.java.Before;

public class HookWithTags {

    /**
     * This can be done for Before, After, BeforeStep and AfterStep
     */
    @Before("@smokeTest1 and @smokeTest2")
    public void beforeScenarioWithTag(){

        System.out.println(" only run for specific tag");
    }


}

package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ScenarioHooks {

    @Before
    public void beforeScenario(){
        System.out.println("before scenario - Hook");
    }


    @After
    public void afterScenario(){
        System.out.println("after scenario - Hook");
    }
}

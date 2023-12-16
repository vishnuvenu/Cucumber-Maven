package hooks;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class StepHooks {

    @BeforeStep
    public void beforeStep(){
        System.out.println("before each step");
    }
    @AfterStep
    public void AfterStep(){
        System.out.println("after each step");
    }
}

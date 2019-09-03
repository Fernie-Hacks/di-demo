package tech.gonzalezfernando.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import tech.gonzalezfernando.didemo.services.GreetingServiceImpl;

import static junit.framework.TestCase.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}
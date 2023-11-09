package de.richargh.template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreeterTest {

	@Test
    void canGreetGivenName() {
    	// given
    	String name = "Alex";
    	Greeter greeter = new Greeter(name);

    	// when
    	String result = greeter.speak();

    	// then
        assertEquals(name, result);
    }	
}

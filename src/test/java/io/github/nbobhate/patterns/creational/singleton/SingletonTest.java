package io.github.nbobhate.patterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void test() {
        Manager manager1 = Manager.getInstance();
        Manager manager2 = Manager.getInstance();

        assertEquals(manager1, manager2);
        assertEquals(manager1.getName(), manager2.getName());
    }

}

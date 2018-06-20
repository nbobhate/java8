package io.github.nbobhate.patterns.creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BuilderTest {

    @Test
    public void test() {
        Profile profile1 = new Profile.ProfileBuilder().withFirstName("Mary").withCellNumber("12345").build();

        assertEquals("Mary", profile1.getFirstName());
        assertEquals("12345", profile1.getCellNumber());
        assertNull(profile1.getLastName());
        assertNull(profile1.getTitle());
        assertNull(profile1.getEmailAddress());

        Profile profile2 = new Profile.ProfileBuilder()
                .withFirstName("Mary")
                .withLastName("Smith")
                .withTitle("Miss")
                .withCellNumber("12345")
                .withEmailAddress("mary.smith@waffles.com")
                .build();

        assertEquals("Mary", profile2.getFirstName());
        assertEquals("Smith", profile2.getLastName());
        assertEquals("Miss", profile2.getTitle());
        assertEquals("12345", profile2.getCellNumber());
        assertEquals("mary.smith@waffles.com", profile2.getEmailAddress());
    }
}

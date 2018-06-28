package io.github.nbobhate.patterns.structural.composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompositeTest {

    @Test
    public void test() {
        Directory directory = new Directory();
        directory.addFile(new TextFile());
        directory.addFile(new PdfFile());

        String output = directory.getName();

        assertEquals("Text File\nPDF File\n", output);
    }
}

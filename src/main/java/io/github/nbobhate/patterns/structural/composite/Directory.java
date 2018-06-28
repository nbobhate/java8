package io.github.nbobhate.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {

    private List<File> files;

    public Directory() {
        files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public String getName() {
        final StringBuilder stringBuilder = new StringBuilder();
        files.forEach(f -> stringBuilder.append(f.getName()).append("\n"));
        return stringBuilder.toString();
    }
}

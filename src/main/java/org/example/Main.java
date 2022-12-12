package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Facade.convert("src/main/resources/example.txt", "src/main/resources/example_converted.txt", dataType.txt);
    }
}
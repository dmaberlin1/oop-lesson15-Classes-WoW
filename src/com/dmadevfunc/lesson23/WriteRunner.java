package com.dmadevfunc.lesson23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteRunner {
    public static void main(String[] args) throws IOException {
        Path file= Path.of("resources","writer.poem");
        Path file2= Path.of("resources","writer2.poem");
        Files.write(file2, List.of("Hello worlddd!!!","Jaaavaaa"));
        try (BufferedWriter fileWriter = Files.newBufferedWriter(file)) {
            fileWriter.append("Hello World!");
            fileWriter.newLine();
            fileWriter.append("Java");
        }
    }
}

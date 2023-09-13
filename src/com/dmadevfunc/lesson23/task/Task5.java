package com.dmadevfunc.lesson23.task;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Path path = Path.of("src", "com", "dmadevfunc", "lesson23","task", "Task4.java");
        Path resultPath = Path.of("resources", "Task4Modify.java");
        try (Stream<String> lines = Files.lines(path);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(resultPath, StandardOpenOption.APPEND,StandardOpenOption.CREATE)) {
             lines.map(StringBuilder::new).map(StringBuilder::reverse).forEach(line-> {
                 try {
                     bufferedWriter.write(line.toString());
                     bufferedWriter.newLine();
                 } catch (IOException e) {
                     throw new RuntimeException(e);
                 }
             });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

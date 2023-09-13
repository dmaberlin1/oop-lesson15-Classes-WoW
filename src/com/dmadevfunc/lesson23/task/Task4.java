package com.dmadevfunc.lesson23.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "dmadevfunc", "lesson23","task", "Task3.java");
        String readString = Files.readString(path);

        String replaceResult = readString.replace("public", "private");

        Path resultPath = Path.of("resources", "Task3Modify.java");
        Files.writeString(resultPath,replaceResult);
    }
}

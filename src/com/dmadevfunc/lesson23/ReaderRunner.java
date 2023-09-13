package com.dmadevfunc.lesson23;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("resources", "fileBase1.txt");
        try (Stream<String> lines = Files.lines(file)) {
            lines.forEach(System.out::println);
        }
        try (BufferedReader fileReader = Files.newBufferedReader(file)){
            String collect = fileReader.lines().collect(Collectors.joining("\n"));
            System.out.println(collect);
        }


        }
}

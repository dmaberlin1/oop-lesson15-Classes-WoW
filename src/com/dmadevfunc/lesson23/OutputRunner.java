package com.dmadevfunc.lesson23;

import java.io.*;
import java.nio.file.Path;

public class OutputRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "outputFile.txt").toFile();
        try (BufferedOutputStream fileOutputStream =new BufferedOutputStream( new FileOutputStream(file, true)) ){
            String value="hello world!";
            fileOutputStream.write(value.getBytes());
            fileOutputStream.write(System.lineSeparator().getBytes());
        }
    }
}

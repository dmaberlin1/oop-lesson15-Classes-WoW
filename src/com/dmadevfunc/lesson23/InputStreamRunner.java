package com.dmadevfunc.lesson23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

import static java.io.File.separator;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
//        File file=new File(String.join(separator,"resources","fileBase1.txt"));
        File file = Path.of("resources", "fileBase1.txt").toFile();
        System.out.println(file.isFile());
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) !=-1){
                bytes[counter++]=currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);

//            byte[] bytes = inputStream.readAllBytes();
//            String stringValue = new String(bytes);
//            System.out.println(stringValue);
        }
    }
}

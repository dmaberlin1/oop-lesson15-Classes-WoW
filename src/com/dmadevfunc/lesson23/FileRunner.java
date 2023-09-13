package com.dmadevfunc.lesson23;

import java.io.File;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file1=new File("resources/fileBase1.txt");
        System.out.println(file1.createNewFile());
        System.out.println(file1.exists());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.getParentFile());
        System.out.println(file1.getAbsolutePath());
        File dir=new File("resources/test/dir");
        System.out.println(dir.mkdirs());
    }
}

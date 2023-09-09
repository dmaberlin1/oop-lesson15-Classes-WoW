package com.dmadev.lesson16;

public class EnumRunner {
    public static void main(String[] args) {
        ProcessorType bit32 = ProcessorType.BIT_32;
        System.out.println(ProcessorType.BIT_64.ordinal());
        System.out.println(bit32.getName());
        System.out.println(bit32.getDescription());
    }
}


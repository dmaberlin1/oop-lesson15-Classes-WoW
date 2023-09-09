package com.dmadev.lesson16;

public enum ProcessorType implements Descriable {
    BIT_32("bit-32") {
        @Override
        public String getDescription() {
            return "In computer architecture, 32-bit integers, memory addresses," +
                    " or other data units are those that are 32 bits (4 octets or 4 Bytes) wide.";
        }
    },
    BIT_64("bit-64") {
        @Override
        public String getDescription() {
            return "A 64-bit processor refers to a microprocessor" +
                    " that can process data and instructions in chunks of 64 bits.";
        }
    };

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

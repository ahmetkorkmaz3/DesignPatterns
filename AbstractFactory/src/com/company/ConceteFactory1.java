package com.company;

public class ConceteFactory1 extends Factory {
    @Override
    HddAbstract createHdd() {
        return new ConcereteHdd1();
    }

    @Override
    RamAbstract createRam() {
        return new ConcereteRam1();
    }
}

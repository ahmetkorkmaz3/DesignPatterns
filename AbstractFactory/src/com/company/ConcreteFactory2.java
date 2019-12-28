package com.company;

public class ConcreteFactory2 extends Factory {
    @Override
    HddAbstract createHdd() {
        return new ConcereteHdd2();
    }

    @Override
    RamAbstract createRam() {
        return new ConcereteRam2();
    }
}

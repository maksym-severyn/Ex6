package com.infoshareacademy.util;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Randomizer {

    private final Random random;

    public Randomizer() {
        this.random = new Random(System.currentTimeMillis());
    }

    public int getRandomNumberBetween(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public int getRandomNumberFromOneTo(int max) {
        return getRandomNumberBetween(1, max);
    }
}
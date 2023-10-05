package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {

    private Random random;
    private int min;
    private int max;

    public RandomIterator(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.nextInt(max - min + 1) + min;
    }
}

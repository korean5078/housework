package com.housework;

public class Housework {
    private String name;
    private Times times;
    private int count;

    public Housework(String name, Times times, int count) {
        this.name = name;
        this.times = times;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Times getTimes() {
        return times;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Housework{" +
                "name='" + name + '\'' +
                ", times=" + times +
                ", count=" + count +
                '}';
    }
}

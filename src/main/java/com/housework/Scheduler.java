package com.housework;

import java.util.Calendar;
import java.util.List;

public class Scheduler {
    private final Calendar calendar = Calendar.getInstance();
    private final int month;

    public Scheduler() {
        this.month = calendar.get(Calendar.MONTH) + 1;
    }

    public Scheduler(int month) {
        this.month = month;
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
    }

    public int getMonth() {
        return month;
    }

    public int getLastDay() {
        return calendar.getActualMaximum(Calendar.DATE);
    }

    public void schedule(List<Member> members) {
        for (int i = 0; i < getLastDay() * 2; i++) {
            System.out.println((i/2 + 1) + " " + members.get(i % members.size()).getName());
        }
    }

    public void schedule(List<Member> members, List<Housework> houseworks) {
        for (int i = 0; i < houseworks.size(); i++) {
            System.out.println(houseworks.get(i).getName());
            if (houseworks.get(i).getTimes() == Times.day) {
                for (int j = 0; j < getLastDay() * houseworks.get(i).getCount(); j++) {
                    System.out.println((j/houseworks.get(i).getCount() + 1) + " " + members.get(j % members.size()).getName());
                }
            } else if (houseworks.get(i).getTimes() == Times.week) {

            } else {

            }
        }
    }
}

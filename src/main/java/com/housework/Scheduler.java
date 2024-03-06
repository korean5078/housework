package com.housework;

import java.util.Calendar;
import java.util.List;

public class Scheduler {
    private final Calendar calendar = Calendar.getInstance();
    private final int month;
    private List<Member> members;

    public Scheduler() {
        this.month = calendar.get(Calendar.MONTH) + 1;
    }

    public Scheduler(int month) {
        this.month = month;
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Member> getMembers() {
        return this.members;
    }

    public int getMonth() {
        return month;
    }

    public int getLastDay() {
        return calendar.getActualMaximum(Calendar.DATE);
    }

    public void schedule() {
        for (int i = 0; i < getLastDay() * 2; i++) {
            System.out.println((i/2 + 1) + " " + getMembers().get(i%getMembers().size()).getName());
        }
    }
}

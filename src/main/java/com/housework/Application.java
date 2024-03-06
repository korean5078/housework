package com.housework;

import com.housework.view.InputView;
import java.io.IOException;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        Scheduler scheduler = new Scheduler();
        List<Member> members = inputView.createMembers();
        scheduler.setMembers(members);
        scheduler.schedule();
    }
}

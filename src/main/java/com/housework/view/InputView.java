package com.housework.view;

import com.housework.Housework;
import com.housework.Member;
import com.housework.Times;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class InputView {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public List<String> inputMemberName() throws IOException {
        System.out.println("멤버들의 이름을 입력해주세요.");
        List<String> names = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        while (st.hasMoreTokens()) {
            names.add(st.nextToken());
        }

        return names;
    }

    public List<Member> createMembers() throws IOException {
        List<Member> members = new ArrayList<>();
        for (String name : inputMemberName()) {
            members.add(new Member(name));
        }

        return members;
    }

    private int inputNumberOfHousework() throws IOException {
        System.out.println("일정을 계획하고자 하는 집안일의 개수를 입력하세요.");
        return Integer.parseInt(br.readLine());
    }

    public List<Housework> createHousework() throws IOException {
        List<Housework> housework = new ArrayList<>();
        int number = inputNumberOfHousework();
        System.out.println("집안일의 이름, 날짜 단위, 횟수를 입력하세요.");
        for (int i = 0; i < number; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            String name = st.nextToken();
            String times = st.nextToken();
            int count = Integer.parseInt(st.nextToken());

            housework.add(new Housework(name, Times.valueOf(times), count));
        }
        return housework;
    }

    private boolean close() throws IOException {
        br.close();
        return true;
    }
}

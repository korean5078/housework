package com.housework.view;

import com.housework.Member;
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

    private boolean close() throws IOException {
        br.close();
        return true;
    }
}

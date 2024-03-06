package com.housework;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SchedulerTest {
    @Test
    void 스케쥴러_생성() {
        Scheduler scheduler = new Scheduler();
        Assertions.assertThat(scheduler.getMonth()).isEqualTo(1);
        Assertions.assertThat(scheduler.getLastDay()).isEqualTo(31);

        // 달을 지정해서 생성
        Scheduler scheduler2 = new Scheduler(2);
        Assertions.assertThat(scheduler2.getMonth()).isEqualTo(2);
        Assertions.assertThat(scheduler2.getLastDay()).isEqualTo(29);
    }

    @Test
    void 스케쥴러_멤버_설정() {
        List<Member> members = new ArrayList<>();
        Scheduler scheduler = new Scheduler();

        Member member = new Member("member");
        member.setHolidays(List.of(1,2,3));

        Member member2 = new Member("member");
        member2.setHolidays(List.of(4,5,6));

        members.add(member);
        members.add(member2);

        scheduler.setMembers(members);
        Assertions.assertThat(member.getHolidays()).isEqualTo(scheduler.getMembers().get(0).getHolidays());
        Assertions.assertThat(member2.getHolidays()).isEqualTo(scheduler.getMembers().get(1).getHolidays());
    }
}

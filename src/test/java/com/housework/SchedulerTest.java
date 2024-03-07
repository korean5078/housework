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
    void 스케줄러_테스트() {
        List<Housework> houseworkList = new ArrayList<>();
        houseworkList.add(new Housework("설거지", Times.day, 2));

        List<Member> members = new ArrayList<>();
        members.add(new Member("h1"));
        members.add(new Member("h2"));
        members.add(new Member("h3"));
        members.add(new Member("h4"));

        Scheduler scheduler = new Scheduler();
        scheduler.schedule(members, houseworkList);
    }
}

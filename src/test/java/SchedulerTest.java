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
}

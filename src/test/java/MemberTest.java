import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {
    Member member = new Member("member");
    @Test
    void 멤버_생성() {
        Assertions.assertThat(member.getName()).isEqualTo("member");
    }

    @Test
    void 멤버_휴일_지정() {
        List<Integer> holidays = List.of(1, 2, 4, 5, 7, 8);

        member.setHolidays(holidays);

        Assertions.assertThat(member.getHolidays()).isEqualTo(List.of(1, 2, 4, 5, 7, 8));
    }
}

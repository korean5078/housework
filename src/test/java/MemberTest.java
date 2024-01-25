import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {
    @Test
    void 멤버_생성() {
        Member member = new Member("member1");
        Assertions.assertThat(member.getName()).isEqualTo("member1");
    }
}

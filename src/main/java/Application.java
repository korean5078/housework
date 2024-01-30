import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        Member member = new Member("father");
        Member member2 = new Member("mother");
        Member member3 = new Member("me");
        Member member4 = new Member("sister");
        List<Member> members = new ArrayList<>();

        members.add(member);
        members.add(member2);
        members.add(member3);
        members.add(member4);
        scheduler.setMembers(members);

        scheduler.schedule();
    }
}

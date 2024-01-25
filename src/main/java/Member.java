import java.util.List;

public class Member {
    private long id;
    private String name;
    private List<Integer> holidays;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

import java.util.Calendar;

public class Scheduler {
    private final Calendar calendar = Calendar.getInstance();
    private final int month;

    public Scheduler() {
        this.month = calendar.get(Calendar.MONTH) + 1;
    }

    public Scheduler(int month) {
        this.month = month;
        calendar.set(Calendar.MONTH, month - 1);
    }

    public int getMonth() {
        return month;
    }

    public int getLastDay() {
        return calendar.getActualMaximum(Calendar.DATE);
    }
}

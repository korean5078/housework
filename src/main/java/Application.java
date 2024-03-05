import view.InputView;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        Scheduler scheduler = new Scheduler();
        int numberOfMember = inputView.inputNumberOfMember();
    }
}

package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int inputNumberOfMember() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private boolean close() throws IOException {
        br.close();
        return true;
    }
}

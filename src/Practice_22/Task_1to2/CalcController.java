package Practice_22.Task_1to2;

import javax.swing.*;

public class CalcController {
    private CalcModel model;

    private CalcView view;

    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }

    public void printResult(JTextField example) {
        view.updateResult(example, model.calculate(example.getText()));
    }
}

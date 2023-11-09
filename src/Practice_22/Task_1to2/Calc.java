package Practice_22.Task_1to2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Calc {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcController calcController = new CalcController(model, view);

        JFrame frame = new JFrame("Калькулятор");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 4));

        JTextField example = new JTextField();
        example.setHorizontalAlignment(SwingConstants.RIGHT);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        final int[] numsCnt = {0};
        final int[] actionsCnt = { 0 };
        for (String buttonLabel : buttonLabels){
            JButton button = new JButton(buttonLabel);
            panel.add(button);

            button.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String action = button.getText();

                    if (action.equals("=")) {
                        if (actionsCnt[0] != (numsCnt[0] - 1)) example.setText("Неверный пример!");
                        else calcController.printResult(example);
                    }
                    else if (action.equals("/") || action.equals("*") || action.equals("-") || action.equals("+")) {
                        actionsCnt[0]++;
                        example.setText(example.getText() + action + " ");
                    }
                    else if (action.equals("C")) {
                        numsCnt[0] = 0;
                        actionsCnt[0] = 0;
                        example.setText("");
                    }
                    else {
                        numsCnt[0]++;
                        example.setText(example.getText() + action + " ");
                    }
                }
            });
        }

        frame.setLayout(new BorderLayout());
        frame.add(example, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

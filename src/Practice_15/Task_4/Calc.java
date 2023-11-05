package Practice_15.Task_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Calc {
    public static void main(String[] args) {
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

        final boolean[] isOperation = {false};
        for (String buttonLabel : buttonLabels){
            JButton button = new JButton(buttonLabel);
            panel.add(button);

            button.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String action = button.getText();

                    if (action.equals("=") && isOperation[0]) {
                        isOperation[0] = false;
                        example.setText(String.valueOf(count(example.getText())));
                    }
                    else if (action.equals("/") || action.equals("*") || action.equals("-") || action.equals("+")) {
                        if (isOperation[0]) return;
                        isOperation[0] = true;
                        example.setText(example.getText() + " " + action + " ");
                    }
                    else if (action.equals("C")) {
                        isOperation[0] = false;
                        example.setText("");
                    }
                    else {
                        example.setText(example.getText() + action);
                    }
                }
            });
        }

        frame.setLayout(new BorderLayout());
        frame.add(example, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static double count(String example) {
        String[] exampleArray = example.split(" ");
        switch (exampleArray[1]){
            case "/" -> {
                return Double.parseDouble(exampleArray[0]) / Double.parseDouble(exampleArray[2]);
            }
            case "*" -> {
                return Double.parseDouble(exampleArray[0]) * Double.parseDouble(exampleArray[2]);
            }
            case "+" -> {
                return Double.parseDouble(exampleArray[0]) + Double.parseDouble(exampleArray[2]);
            }
            case "-" -> {
                return Double.parseDouble(exampleArray[0]) - Double.parseDouble(exampleArray[2]);
            }
        }
        return 0.0;
    }
}

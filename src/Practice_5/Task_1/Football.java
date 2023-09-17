package Practice_5.Task_1;

import javax.swing.*;
import java.awt.*;

public class Football {
    private static int milanScore = 0;
    private static int madridScore = 0;

    private static JLabel resultLabel;
    private static JLabel lastScorerLabel;
    private static JLabel winnerLabel;

    public static void main(String[] args) {
            JFrame frame = new JFrame("Football");
            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 2));

            JButton milanButton = new JButton("AC Milan");
            JButton madridButton = new JButton("Real Madrid");

            milanButton.addActionListener(e -> {
                milanScore++;
                lastScorerLabel.setText("Last Scorer: AC Milan");
                updateResult();
            });

            madridButton.addActionListener(e -> {
                madridScore++;
                lastScorerLabel.setText("Last Scorer: Real Madrid");
                updateResult();
            });

            resultLabel = new JLabel("Result: 0 X 0");
            lastScorerLabel = new JLabel("Last Scorer: N/A");
            winnerLabel = new JLabel("Winner: DRAW");

            panel.add(milanButton);
            panel.add(madridButton);
            panel.add(resultLabel);
            panel.add(lastScorerLabel);
            panel.add(winnerLabel);

            frame.add(panel);
            frame.setVisible(true);
    }

    private static void updateResult() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}

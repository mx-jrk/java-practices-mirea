package Practice_16.Task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuessNumberGame {
    private static final int targetNumber = (int) (Math.random() * 21);
    private static int attempts = 0;
    private static final int maxAttempts = 3;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Игра-угадайка");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Угадай число от 0 до 20");
        JTextField guessField = new JTextField(10);
        JButton guessButton = new JButton("Попробовать угадать");

        frame.add(welcomeLabel, BorderLayout.NORTH);
        frame.add(guessField, BorderLayout.CENTER);
        frame.add(guessButton, BorderLayout.SOUTH);

        guessButton.addActionListener(e -> {
            if (attempts < maxAttempts) {
                try {
                    int guess = Integer.parseInt(guessField.getText());
                    if (guess == targetNumber) {
                        JOptionPane.showMessageDialog(frame, "Вы угадали число!", "Поздравляем!", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    } else {
                        attempts++;
                        String message = "Попытка " + attempts + ": ";
                        if (guess < targetNumber) {
                            message += "Число больше.";
                        } else {
                            message += "Число меньше.";
                        }
                        JOptionPane.showMessageDialog(frame, message, "Попробуйте еще раз", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Введите число от 0 до 20.", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Вы исчерпали все попытки. Загаданное число было " + targetNumber, "Конец игры", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            guessField.setText("");
        });

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getSource() == frame) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЦАО", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (x < frame.getWidth() / 5) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЗАО", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
                } else if (x > frame.getWidth() * 4 / 5) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в ВАО", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
                } else if (y < frame.getHeight() / 5) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в САО", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
                } else if (y > frame.getHeight() * 4 / 5) {
                    JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЮАО", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}

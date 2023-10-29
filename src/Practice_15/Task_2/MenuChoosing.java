package Practice_15.Task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuChoosing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Выбор страны");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        String[] countries = {"Australia", "China", "England", "Russia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);

        frame.add(countryComboBox);

        frame.setVisible(true);
    }
}

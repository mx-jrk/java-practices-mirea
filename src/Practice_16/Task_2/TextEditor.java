package Practice_16.Task_2;

import javax.swing.*;
import java.awt.*;

public class TextEditor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Текстовый редактор");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        JTextArea textArea = new JTextArea(10, 40);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));

        redItem.addActionListener(e -> textArea.setForeground(Color.RED));

        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));

        timesNewRomanItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12)));

        msSansSerifItem.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 12)));

        courierNewItem.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 12)));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);
        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        frame.setJMenuBar(menuBar);

        frame.add(new JScrollPane(textArea));

        frame.setVisible(true);
    }
}

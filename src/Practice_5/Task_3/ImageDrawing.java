package Practice_5.Task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class ImageDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String imageUrl = scanner.nextLine();


            JFrame frame = new JFrame("Отображение изображения");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            JPanel imagePanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    try {
                        URL url = new URL(imageUrl);
                        BufferedImage image = ImageIO.read(url);
                        g.drawImage(image, 0, 0, this);
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Не удалось загрузить изображение.");
                    }
                }
            };

            frame.add(imagePanel);
            frame.setVisible(true);
    }
}

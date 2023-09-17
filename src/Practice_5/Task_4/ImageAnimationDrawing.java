package Practice_5.Task_4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Scanner;

public class ImageAnimationDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество изображений в анимации");
        int imageCount = scanner.nextInt();
        scanner.nextLine();

        String [] imageUrls = new String[imageCount];
        for (int i = 0; i < imageCount; i++){
            System.out.println("Введите сылку на изображние " + (i + 1));
            imageUrls[i] = scanner.nextLine();
        }


        JFrame frame = new JFrame("Отображение изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                try {
                    URL url;
                    BufferedImage image;
                    for (String imageUrl : imageUrls){
                        url = new URL(imageUrl);
                        image = ImageIO.read(url);
                        g.drawImage(image, 0, 0, this);
                    }

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

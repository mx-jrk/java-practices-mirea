package Practice_12.Task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Animation {
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;
    private static final int DELAY = 1000;
    private static final String[] IMAGE_URLS = {
            "https://tiniatov.ru/wp-content/uploads/c/a/b/cab466aa3eb8325e9ef78a9935ad56c3.png",
            "https://e7.pngegg.com/pngimages/769/163/png-clipart-professional-java-programmer-software-development-software-developer-others-miscellaneous-text.png",
            "https://tiniatov.ru/wp-content/uploads/a/f/c/afc39d2488aaf2a9c242ca3d23a128dd.png"
    };

    private int currentFrameIndex = 0;
    private ImageIcon[] frameIcons;
    private JLabel animationLabel;
    private Timer timer;

    public Animation() {
        frameIcons = new ImageIcon[IMAGE_URLS.length];
        for (int i = 0; i < IMAGE_URLS.length; i++) {
            try {
                URL imageUrl = new URL(IMAGE_URLS[i]);
                Image image = ImageIO.read(imageUrl);
                frameIcons[i] = new ImageIcon(image);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        JFrame frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        animationLabel = new JLabel(frameIcons[currentFrameIndex]);
        frame.add(animationLabel);

        timer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Переключаемся на следующий кадр
                currentFrameIndex = (currentFrameIndex + 1) % frameIcons.length;
                animationLabel.setIcon(frameIcons[currentFrameIndex]);
            }
        });

        timer.start();

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Animation();
            }
        });
    }
}

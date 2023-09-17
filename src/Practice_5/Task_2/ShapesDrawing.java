package Practice_5.Task_2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс для фигур
abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Метод для рисования фигуры
    public abstract void draw(Graphics g);
}

// Класс для представления круга
class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color,x,y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}

// Класс для представления прямоугольника
class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class ShapesDrawing{
    public static void main(String[] args) {
                JFrame frame = new JFrame("Случайные фигуры");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 400);

                JPanel panel = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);

                        Random rand = new Random();

                        for (int i = 0; i < 20; i++) {
                            int x = rand.nextInt(getWidth());
                            int y = rand.nextInt(getHeight());
                            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));


                            if (rand.nextBoolean()) {
                                int radius = rand.nextInt(50) + 1;
                                Circle circle = new Circle(color, x, x, radius);
                                circle.draw(g);
                            } else {
                                int width = rand.nextInt(100) + 2; // Случайная ширина
                                int height = rand.nextInt(100) + 2; // Случайная высота
                                Rectangle rectangle = new Rectangle(color, x, y, width, height);
                                rectangle.draw(g);
                            }
                        }
                    }
                };

                frame.add(panel);
                frame.setVisible(true);
    }
}

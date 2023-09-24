package Pratice_6.Task_1;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(3, 4, 1, 2, 5);

        movableCircle.moveDown();
        movableCircle.moveDown();

        movableCircle.moveLeft();
        movableCircle.moveLeft();

        movableCircle.moveUp();

        movableCircle.moveRight();

        System.out.println(movableCircle);
    }
}
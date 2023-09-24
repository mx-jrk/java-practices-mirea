package Practice_6.Task_1;

public class MovablePoint implements Movable{
    protected int x;

    protected int y;

    protected int xSpeed;

    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        ySpeed++;
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        ySpeed--;
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        xSpeed--;
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        xSpeed++;
        x += xSpeed;
    }
}
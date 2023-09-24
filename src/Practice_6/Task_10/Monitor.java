package Practice_6.Task_10;

public class Monitor {
    private final String title;

    private final double diagonal;

    private final int herzovka;

    public Monitor(String title, double diagonal, int herzovka) {
        this.title = title;
        this.diagonal = diagonal;
        this.herzovka = herzovka;
    }

    public String getTitle() {
        return title;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public int getHerzovka() {
        return herzovka;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "Название: '" + title + '\'' +
                ", Диагональ: " + diagonal +
                ", Герцовка: " + herzovka +
                '}';
    }
}

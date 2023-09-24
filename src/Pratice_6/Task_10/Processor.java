package Pratice_6.Task_10;

public class Processor {
    private final String title;

    private final int cores;

    private final int threads;

    public Processor(String title, int cores, int threads) {
        this.title = title;
        this.cores = cores;
        this.threads = threads;
    }

    public String getTitle() {
        return title;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "Название: '" + title + '\'' +
                ", Количество ядер: " + cores +
                ", Количество потоков: " + threads +
                '}';
    }
}

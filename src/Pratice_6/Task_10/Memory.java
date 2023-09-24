package Pratice_6.Task_10;

public class Memory {
    private final String title;

    private final int gigabytes;

    public Memory(String title, int gigabytes) {
        this.title = title;
        this.gigabytes = gigabytes;
    }

    public String getTitle() {
        return title;
    }

    public int getGigabytes() {
        return gigabytes;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "НазваниеЖ '" + title + '\'' +
                ", Количетсво гигабайт: " + gigabytes +
                '}';
    }
}

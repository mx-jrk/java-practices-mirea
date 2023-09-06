package Practice_2.Task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop {
    private final String title;

    private List<Computer> computers;

    public Shop(String title) {
        this.title = title;
        this.computers = new ArrayList<>();
    }

    public void addComputer(String title, int cost) {
        computers.add(new Computer(title, cost));
    }

    public void deleteComputer(String title){
        for (Computer computer : computers){
            if (Objects.equals(computer.getTitle(), title)) {
                computers.remove(computer);
                return;
            }
        }
    }

    public Computer findComputerByCost(int cost){
        for (Computer computer : computers){
            if (Math.abs(computer.getCost() - cost) < 500) return computer;
        }
        return null;
    }

    public Computer findComputerByTitle(String title){
        for (Computer computer : computers){
            if (Objects.equals(computer.getTitle(), title)) return computer;
        }
        return null;
    }
}

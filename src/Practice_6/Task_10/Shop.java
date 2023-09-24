package Practice_6.Task_10;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ShopTools{
    private final List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    @Override
    public void findComputerByModel(String model) {
        for (Computer computer : computers)
            if (computer.getModel().equals(model)){
                System.out.println("Компьютер данной модели найден.");
                System.out.println(computer);
                return;
            }
        System.out.println("Компьютер данной модели не был найден.");
    }

    @Override
    public void deleteComputerByModel(String model) {
        for (Computer computer : computers)
            if (computer.getModel().equals(model)){
                computers.remove(computer);
                System.out.println("Компьютер модели " + model + " был удалён.");
                return;
            }
        System.out.println("Компьютер данной модели не был найден.");
    }

    @Override
    public void addComputer(String model, Brand brand,
                            String memoryTitle, int memoryGigabytes,
                            String monitorTitle, double monitorDiagonal, int herzovka,
                            String processorTitle, int processorCores, int processorThreads,
                            int cost) {
        Computer newComputer = new Computer(model, brand,
                new Memory(memoryTitle, memoryGigabytes),
                new Monitor(monitorTitle, monitorDiagonal, herzovka),
                new Processor( processorTitle, processorCores, processorThreads),
                cost);
        computers.add(newComputer);
        System.out.println("Был добавлен компьютер " + newComputer);
    }


    public static void main(String[] args) {
        Shop computerShop = new Shop();

        computerShop.addComputer("len101", Brand.Lenovo,
                "Corsar", 16,
                "Philiips LX-12", 27, 75,
                "Intel core i7", 8, 16,
                120000);
        computerShop.addComputer("hp21", Brand.HP,
                "Opero", 8,
                "Asus Ld-1", 20, 144,
                "Intel core i9", 16, 16,
                90000);
        computerShop.addComputer("macM1", Brand.Mac,
                "Gigabyte", 12,
                "Acer mon-27", 27, 120,
                "M1", 16, 32,
                200000);

        computerShop.findComputerByModel("hp21");

        computerShop.deleteComputerByModel("fsd");
        computerShop.deleteComputerByModel("hp21");

        computerShop.findComputerByModel("hp21");
        computerShop.findComputerByModel("macM1");



    }
}

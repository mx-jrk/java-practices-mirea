package Practice_6.Task_10;

public interface ShopTools {
    void findComputerByModel(String model);

    void deleteComputerByModel(String model);

    void addComputer(String model, Brand brand,
                     //Memory:
                    String memoryTitle, int memoryGigabytes,
                    //Monitor:
                    String monitorTitle, double monitorDiagonal, int herzovka,
                    //Processor:
                    String processorTitle, int processorCores, int processorThreads,
                    int cost);


}

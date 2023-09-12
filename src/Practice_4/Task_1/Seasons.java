package Practice_4.Task_1;

public enum Seasons {
    SPRING("Весна", "Слегка тёплое время года"),
    SUMMER("Лето", "Тёплое время года"),
    ATUMN("Осень", "Прохладное время года"),
    WINTER("Зима", "Холодное время года");


    private final String name;

    private final String description;

    private final double averageTemperature;

    Seasons(String name, String description) {
        this.name = name;
        this.description = description;
        this.averageTemperature = 0.0;
    }

    Seasons(String name, String description, double averageTemperature) {
        this.name = name;
        this.description = description;
        this.averageTemperature = averageTemperature;
    }

    public String getName() {
        return name;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        if (this == SUMMER) return "Тёплое время года";
        return description;
    }

    public String getFavouriteSeason(){
        switch (this){
            case ATUMN -> {
                return "Я люблю осень";
            }
            case SPRING -> {
                return "Я люблю весну";
            }
            case SUMMER -> {
                return "Я люблю лето";
            }
            case WINTER -> {
                return "Я люблю зиму";
            }
            default -> {
                return "";
            }
        }
    }

    public static void main(String[] args) {
        Seasons mySeason = SUMMER;
        System.out.println(mySeason.getFavouriteSeason());

        for (Seasons season : Seasons.values()){
            System.out.println(season.getName() + " - " + season.getAverageTemperature() + "°C, " + season.getDescription());
        }
    }
}

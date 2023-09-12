package Practice_4_1.Task_2;

public class Phone {
    private final long  number;

    private final String model;

    private int weight;

    public Phone(long  number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone(){
        number = 0;
        model = "";
        weight = 0;
    }

    public long getNumber() {
        return number;
    }

    public void receiveCall(String name){
        System.out.println("Звонит {" + name + '}');
    }

    public void receiveCall(String name, long number){
        System.out.println("Звонит {" + name + "} c номера {" + number + '}');
    }

    public void sendMessage(long number1){
        System.out.println("Сообщение отправлено на номер {" + number1 + '}');
    }

    public void sendMessage(long number1, long number2){
        System.out.println("Сообщение отправлено на номер {" + number1 + '}');
        System.out.println("Сообщение отправлено на номер {" + number2 + '}');
    }

    public void sendMessage(long number1, long number2, long number3){
        System.out.println("Сообщение отправлено на номер {" + number1 + '}');
        System.out.println("Сообщение отправлено на номер {" + number2 + '}');
        System.out.println("Сообщение отправлено на номер {" + number1 + '}');
        System.out.println("Сообщение отправлено на номер {" + number3 + '}');
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Phone iPhone = new Phone();
        Phone Xiaomi = new Phone(Long.parseLong("89999999999"), "Xiaomi");
        Phone Samsung = new Phone(Long.parseLong("87777777777"), "Samsung", 250);

        System.out.println(iPhone);
        System.out.println(Xiaomi);
        System.out.println(Samsung);

        iPhone.receiveCall("iName");
        Xiaomi.receiveCall("miName");
        Samsung.receiveCall("sName");

        iPhone.receiveCall("iName", Long.parseLong("85555555555"));

        iPhone.sendMessage(Long.parseLong("81111111111"));
        Xiaomi.sendMessage(Long.parseLong("81111111111"), Long.parseLong("82222222222"));
        Samsung.sendMessage(Long.parseLong("81111111111"), Long.parseLong("82222222222"), Long.parseLong("83333333333"));
    }
}

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988, "Максим", "Минск");
        maxim.printHello();

        Human anya = new Human(1993, "Аня", "Москва");
        anya.printHello();

        Human katya = new Human(1992, "Катя", "Калининград");
        katya.printHello();

        Human artem = new Human(1995, "Артем", "Москва");
        artem.printHello();

        Human Maxim = new Human(1988, "Максим", "Минск", "бренд-иенеджер");
        Maxim.printHelloAndJobTitle();

        Human Anya = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
        Anya.printHelloAndJobTitle();

        Human Katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Katya.printHelloAndJobTitle();

        Human Artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        Artem.printHelloAndJobTitle();


        Car ladaGranta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        ladaGranta.printInfo(ladaGranta);

        Car audi = new Car ("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        audi.printInfo(audi);

        Car bmw = new Car ("BMW", "Z8", 3.0, "black", 2021, "Germany");
        bmw.printInfo(bmw);

        Car kia = new Car ("Kia", "Sportage 4-го поколения", 2.4, "red", 2018, "South Korea");
        kia.printInfo(kia);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");
        hyundai.printInfo(hyundai);
    }
}
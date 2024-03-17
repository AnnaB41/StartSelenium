package mantra;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer()
                .withCompany("ASUS")
                .withRam(8)
                .withCpu("ryzen5")
                .withOs("Windows");
        System.out.println(computer);

        Laptop laptop1 = (Laptop) new Laptop()
                .withWebCamera(true)
                .withSize(15.6)
                .withWeight(3.2)
                .withBattery(6000)
                .withCompany("ASUS")
                .withRam(8)
                .withCpu("N4020")
                .withOs("Linux");
        System.out.println(laptop1);
        Desktop desktop = (Desktop) new Desktop()
                .withType("Monoblock")
                .withCompany("JetGames")
                .withRam(6)
                .withCpu("i5")
                .withOs("Windows");
        System.out.println(desktop);
        Smartphone smartphone = (Smartphone) new Smartphone()
                .withSimCount(2)
                .withCamera(true)
                .withSize(6.2)
                .withWeight(0.36)
                .withBattery(4000)
                .withCompany("Samsung")
                .withRam(12)
                .withOs("Android");
        System.out.println(smartphone);




    };
}

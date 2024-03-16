public class MainCar {

    public static void main(String[] args) {

        int[] ar = {1,7,3};

        System.out.println(ar);
        System.out.println(ar[1]);

        Car c = new Car();
        System.out.println(c);
        System.out.println(c.getBrand());

        c.toDrive();  // обращение к нестатическому методу, методу объекта

        Car.fire(); // обращение к статическому методу, через класс

        Car c1 = new Car(2020);

        Car c2 = new Car(0.0001, -2000, 2, "Civic");

        System.out.println(c2);
        c2.setYear(1977);
        System.out.println(c2);

        Car c3 = new Car();
        c3.setEngine(1.5);
        c3.setYear(2023);
        c3.setModel("Civic");

        System.out.println(c3);

        Car c4 = new Car().withEngine(2020).withEngine(2.4);

        SportCar sc1 = new SportCar();

      //  System.out.println(sc1);

        Truck t1 = new Truck();



    }
}

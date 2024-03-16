package oop;

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

        Formula1 f = new Formula1();

        f.sendSOS();
        f.toSale();

        Car c5 = new Formula1();

        Movable m1 = new Formula1();


        t1.toDrive();
        sc1.toDrive();
        f.toDrive();

        Car[] cars = new Car[3];
        cars[0] = t1;
        cars[1] = sc1;
        cars[2] = f;

        for(Car car : cars){
            car.toDrive();
        }

        Movable[] arr = new Movable[2];
        arr[0] = new Formula1();
        arr[1] = new Truck();

        for(Movable mov : arr){
            mov.sendSOS();
        }



    }
}

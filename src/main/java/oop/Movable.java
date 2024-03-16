package oop;

public interface Movable {

//    double length = 3.5;
    void sendSOS();

    static void anyMethod(){
        System.out.println();
    }

    default void otherMethod(){
        System.out.println();
    }

}

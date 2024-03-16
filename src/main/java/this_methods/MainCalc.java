package this_methods;

public class MainCalc {

    public static void main(String[] args) {

        Calc.printRes();

        Calc c = new Calc(4,6);
        Calc c1 = new Calc(3,7);
        c.calculate(2,5,'+');
        Calc.printRes();

        printAny();

    }

    public static void printAny(){
        System.out.println("Any");
    }
}

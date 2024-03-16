package this_methods;

public class Calc {

    // characteristics - fields - properties - data members

    int a;
    int b;
    static int res = 0;

    public static void printRes(){
        System.out.println("Result = " + res);
    }

    public int calculate(int a, int b, char action){
        switch (action){
            case '+' : res = this.a + b; break;
            case '-' : res = a - b; break;

        }
        return res;
    }

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

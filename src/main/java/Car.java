public class Car {

    // characteristics - fields - properties - data members

    private double engine; // 8 bytes
    private int year; // 4 bytes
    private boolean electric; // 1 bytes
    private String[] colors; // 8 bytes

    private int colorCode; // 4 bytes
    private String brand = "HONDA"; // 8 bytes

    private String model; // 8 bytes

    double price;

    // behaviour - methods поведение объекта, сущности
    // 1. object non static

    public void toDrive(){
        System.out.println("Driving");
    }

    public void toStop(){
        System.out.println("Stopping");
    }

    // 2. class static

    public static void fire( ){
        System.out.println("Fire fighting");
    }

    // constructors
    // 1. default constructor

    public Car(){

    }

    // 2. custom constructor

    public Car (int year){
        this.year = year;  // this это переменная, это ссылка на конкретный экземпляр, который будет создан данным конструктором
    };

    public Car(double engine, boolean electric, int colorCode, String model) {
        this.engine = engine;
        this.electric = electric;
        this.colorCode = colorCode;
        this.model = model;
    }

    public Car(double engine, int year, int colorCode, String model) {
     //   this.engine = engine;
        setEngine(engine);
        if(year < 1900) {
            return;
        } else {
            this.year = year;
        }
        this.colorCode = colorCode;
        this.model = model;
    }

    public void setEngine(double engine) {
        if(engine < 0) return;
        this.engine = engine;
    }

    public Car withEngine(double engine) {
        if(engine < 0) return this;
        this.engine = engine;
        return this;
    }


    public void setYear(int year) {
        if(year < 2000) return;
        this.year = year;
    }

    public Car withYear(int year) {
        if(year < 2000) return this;
        this.year = year;
        return this;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public boolean isElectric() {
        return electric;
    }

    public int getColorCode() {
        return colorCode;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", year=" + year +
                ", electric=" + electric +
                ", colorCode=" + colorCode +
                ", brand= " + brand +
                ", model= " + model +
                ", price=" + price +
                '}';
    }
}

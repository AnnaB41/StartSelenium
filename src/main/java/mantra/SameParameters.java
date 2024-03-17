package mantra;

public abstract class SameParameters extends Computer {
    private double size;
    private double weight;
    private int battery;

    public SameParameters (){

    }
//    public SameParameters(double size, double weight, int battery) {
//        this.size = size;
//        this.weight = weight;
//        this.battery = battery;
//    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public SameParameters withSize(double size) {
        if (size < 0.0) return this;
        this.size = size;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public SameParameters withWeight(double weight) {
        if (weight < 0.0) return this;
        this.weight = weight;
        return this;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
    public SameParameters withBattery(int battery) {
        if (battery < 0) return this;
        this.battery = battery;
        return this;
    }

    @Override
    public String toString() {
        return "SameParameters{" +
                "size=" + size +
                ", weight=" + weight +
                ", battery=" + battery +
                "} " + super.toString();
    }
}

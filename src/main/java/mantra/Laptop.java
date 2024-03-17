package mantra;

public class Laptop extends SameParameters {
    private boolean webCamera;
    public Laptop() {

    }

//    public Laptop(double size, double weight, int battery) {
//        super(size, weight, battery);
//    }

    public boolean isWebCamera() {
        return webCamera;
    }

    public void setWebCamera(boolean webCamera) {
        this.webCamera = webCamera;
    }
    public Laptop withWebCamera(boolean webCamera) {
        this.webCamera = webCamera;
        return this;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "webCamera=" + webCamera +
                "} " + super.toString();
    }
}

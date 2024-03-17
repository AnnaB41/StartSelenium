package mantra;

public class Smartphone extends SameParameters {
    private int simCount;
    private boolean camera;

    public Smartphone() {

    }

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }
    public Smartphone withSimCount(int simCount) {
        if (simCount < 1) return this;
        this.simCount = simCount;
        return this;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }
    public Smartphone withCamera(boolean camera) {
        this.camera = camera;
        return this;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "simCount=" + simCount +
                ", camera=" + camera +
                "} " + super.toString();
    }
}

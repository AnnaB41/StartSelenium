package mantra;

public class Desktop extends Computer {
    private String type;

    public Desktop() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Desktop withType(String type) {
        if (type == null) return this;
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "type=" + type  +
                "} " + super.toString();
    }
}

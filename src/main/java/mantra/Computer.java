package mantra;

public class Computer {

    private String company;
    private int ram;
    private String cpu;
    private String os;
    public Computer(){

    }

    public void setCompany(String company) {
        this.company = company;
    }
    public Computer withCompany(String company) {
        if (company == null) return this;
        this.company = company;
        return this;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public Computer withRam(int ram) {
        if (ram < 0) return this;
        this.ram = ram;
        return this;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public Computer withCpu(String cpu) {
        if (cpu == null) return this;
        this.cpu = cpu;
        return this;
    }

    public void setOs(String os) {
        this.os = os;
    }
    public Computer withOs(String os) {
        if (os == null) return this;
        this.os = os;
        return this;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "company=" + company +
                ", ram=" + ram +
                ", cpu=" + cpu +
                ", os=" + os +
                '}';
    }

}

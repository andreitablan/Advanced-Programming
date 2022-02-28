public class Room {
    type tip;
    private String name;
    private int cap;

    public Room(String name, int cap, type tip) {
        this.name=name;
        this.tip = tip;
        this.cap = cap;
    }

    public type getTip() {
        return tip;
    }

    public void setTip(type tip) {
        this.tip = tip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    @Override
    public String toString() {
        return "Room{" +
                "tip=" + tip +
                ", name='" + name + '\'' +
                ", cap=" + cap +
                '}';
    }
}
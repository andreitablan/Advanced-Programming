public class Event {
    private String name;
    private int size;
    private int end;
    private int start;
    public Event(String name, int size, int start, int end)
    {
        this.name=name;
        this.size=size;
        this.start=start;
        this.end=end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", end=" + end +
                ", start=" + start +
                '}';
    }
}
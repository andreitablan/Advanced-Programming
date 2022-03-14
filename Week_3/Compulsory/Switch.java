public class Switch extends Node{
    private String address;

    /**
     *The basic constructor for the class.
     */
    public Switch(String name) {
        super(name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
 
    @Override
    public String toString() {
        return "Switch{" +
                "address='" + address + '\'' +
                '}' + '\n';
    }
}

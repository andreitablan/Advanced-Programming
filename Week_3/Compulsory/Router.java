public class Router extends Node implements Identifiable{
    private String address;
    
    /**
     *The basic constructor for the class.
     */
    public Router(String name) {
        super(name);
    }
    
    @Override
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Router{" +
                "address='" + address + '\'' +
                '}' +'\n';
    }
}

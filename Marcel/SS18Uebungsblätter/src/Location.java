public class Location {
    private String address, city, state;
    private int zipCode, houseNumber;


    public Location(String address, String city, String state, int zipCode, int houseNumber){
        this.address = address;
        this.city = city;

        this.state = state;
        this.zipCode = zipCode;
        this.houseNumber = houseNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

}

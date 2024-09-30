public class Address {
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address(){}

    public Address(String line1, String line2, String city, String state, String zip, String country){
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public String printAddress() {
        return line1 + ", " + line2 + ", " + city + ", " + state + ", " + zip + ", " + country;
    }

    public void setAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    
}
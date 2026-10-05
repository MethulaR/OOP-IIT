package lk.ac.iit.products_api;

public class Address {

    private String street;
    private String city;
    private String postcode;

    public Address(){}

    public Address(String street, String city, String postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    public String getStreet() {return street;}
    public void setStreet(String street) {this.street = street;}
    public String getCity() {return city;}

}

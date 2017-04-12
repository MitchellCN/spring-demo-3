package com.theironyard;

/**
 * Created by doug on 4/12/17.
 */
public class Address {

    private Integer addressId;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private Integer stateProvinceId;
    private String postalCode;

    public Address() {
    }

    public Address(String addressLine1, String addressLine2, String city, Integer stateProvinceId, String postalCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateProvinceId = stateProvinceId;
        this.postalCode = postalCode;
    }

    public Address(Integer addressId, String addressLine1, String addressLine2, String city, Integer stateProvinceId, String postalCode) {
        this.addressId = addressId;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateProvinceId = stateProvinceId;
        this.postalCode = postalCode;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getStateProvinceId() {
        return stateProvinceId;
    }

    public void setStateProvinceId(Integer stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

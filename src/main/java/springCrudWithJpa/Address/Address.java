package springCrudWithJpa.Address;

import javax.persistence.*;

@Embeddable
public class Address {
    private String permAddress;
    private String tempAddress;

    public Address() {
    }

    public Address(String permAddress, String tempAddress) {
        this.permAddress = permAddress;
        this.tempAddress = tempAddress;
    }

    public String getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(String permAddress) {
        this.permAddress = permAddress;
    }

    public String getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(String tempAddress) {
        this.tempAddress = tempAddress;
    }
}
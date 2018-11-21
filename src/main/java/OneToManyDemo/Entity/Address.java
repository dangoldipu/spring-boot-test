package OneToManyDemo.Entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Address {

    @Id
    private Long id;
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
package springCrudWithJpa.student;

import springCrudWithJpa.Address.Address;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Student {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @Embedded
    Address tmpAddress;

    public Student() {
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getTmpAddress() {
        return tmpAddress;
    }

    public void setTmpAddress(Address tmpAddress) {
        this.tmpAddress = tmpAddress;
    }
}

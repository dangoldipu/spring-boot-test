package OneToManyDemo.Repository;

import OneToManyDemo.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import javax.persistence.Entity;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{
}

package api2.api2.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api2.api2.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User,Long> {  
}

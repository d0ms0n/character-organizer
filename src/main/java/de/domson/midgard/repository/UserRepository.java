package de.domson.midgard.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import de.domson.midgard.pojos.User;

/**
 * Created by domson on 24.05.16.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByEmail(String email);

    List<User> findUsersByFirstname(String email);
    List<User> findUsersByLastname(String email);


}

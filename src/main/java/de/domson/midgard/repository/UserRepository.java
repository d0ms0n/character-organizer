package de.domson.midgard.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import de.domson.midgard.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by domson on 24.05.16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByEmail(String email);
    User findUserByUsername(String username);
    @Query(value = "SELECT * FROM users WHERE username = ?1", nativeQuery = true)
    List<User> findUsersByUsername(String username);

}

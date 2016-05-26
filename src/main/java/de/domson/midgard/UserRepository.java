package de.domson.midgard;

import de.domson.midgard.pojos.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by domson on 24.05.16.
 */
public interface UserRepository extends CrudRepository<User, Long> {


}

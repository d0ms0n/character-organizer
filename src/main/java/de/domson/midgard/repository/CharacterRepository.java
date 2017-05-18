package de.domson.midgard.repository;

import de.domson.midgard.model.Character;
import de.domson.midgard.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by domson on 03.04.17.
 */
@Repository
public interface CharacterRepository extends CrudRepository<Character, Long>{

    //@Query(value = "SELECT * FROM characters c where c.username = ?", nativeQuery = true)
    List<Character> findCharactersByUser(User user);

}

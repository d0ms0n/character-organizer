package de.domson.midgard.repository;

import de.domson.midgard.model.Character;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by domson on 03.04.17.
 */
@Repository
public interface CharacterRepository extends CrudRepository<Character, Long>{

    @Query(value = "SELECT * FROM character c where c.username = ?1", nativeQuery = true)
    List<Character> findCharactersByUsername(String username);

}

package de.domson.midgard.repository;

import de.domson.midgard.model.Character;
import de.domson.midgard.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

/**
 * Created by domson on 05.04.17.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration
public class CharacterRepositoryTests {

    @Autowired
    CharacterRepository characterRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    @Sql({"/data-hsqldb.sql"})
    public void testChar(){
        Long charId = 1L;
        Character theChar = characterRepository.findOne(charId);
        assertThat(theChar.getCharId(), equalTo(charId));
    }

    @Test
    public void testChar2(){
        Long charId = new Long(2);
        Character theChar = characterRepository.findOne(charId);
        assertThat(theChar, is(nullValue()));
    }

    @Test
    @Sql({"/data-hsqldb.sql"})
    public void testChar3(){

        List<User> usr = userRepository.findUsersByUsername("DomSon");
        List<Character> chars = characterRepository.findCharactersByUser(usr.get(0));
        assertThat(chars, hasSize(1));
    }
}

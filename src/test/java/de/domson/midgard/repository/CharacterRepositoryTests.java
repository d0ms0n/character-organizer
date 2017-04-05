package de.domson.midgard.repository;

import de.domson.midgard.model.Character;
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

    @Test
    @Sql({"/data-hsqldb.sql"})
    public void testChar(){
        Long charId = new Long(1);
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
        String username = "DomSon";
        List<Character> chars = characterRepository.findCharactersByUsername(username);
        assertThat(chars, hasSize(1));
        List<Character> chars2 = characterRepository.findCharactersByUsername(username+"test");
        assertThat(chars, empty());
    }
}

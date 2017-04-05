package de.domson.midgard.repository;

import de.domson.midgard.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by domson on 03.04.17.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repository;

    @Test
    public void testRepo(){
        User testuser = new User("testuser","test@mail.de","1234",true);
        this.entityManager.persist(testuser);
        User user = this.repository.findUserByUsername("testuser");
        assertThat(user.getUsername()).isEqualTo("testuser");
        assertThat(user.getPassword()).isEqualTo("1234");

        user = this.repository.findUserByEmail("test@mail.de");
        assertThat(user.getEmail()).isEqualTo("test@mail.de");
    }
}

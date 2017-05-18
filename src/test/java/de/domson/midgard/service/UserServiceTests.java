package de.domson.midgard.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import de.domson.midgard.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by domson on 03.04.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
public class UserServiceTests {

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void test(){

        User testuser = new User("testuser","test@mail.de","1234",true);
        this.entityManager.persist(testuser);

        User user = entityManager.find(User.class,testuser.getUserId());;
        assertThat(user.getEmail(), is("test@mail.de"));
    }
}

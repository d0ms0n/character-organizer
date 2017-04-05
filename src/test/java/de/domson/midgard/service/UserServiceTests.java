package de.domson.midgard.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import de.domson.midgard.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by domson on 03.04.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    UserService userService;

    @Test
    public void test(){

        User testuser = new User("testuser","test@mail.de","1234",true);
        this.entityManager.persist(testuser);

        User user = userService.getUserByEmail("test@mail.de");
        assertThat(user.getEmail(), is("test@mail.de"));
    }
}

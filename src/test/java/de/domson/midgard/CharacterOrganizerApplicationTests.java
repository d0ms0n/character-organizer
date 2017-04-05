package de.domson.midgard;

import de.domson.midgard.model.User;
import de.domson.midgard.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CharacterOrganizerApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
    UserRepository userRepository;

	@Test
	public void testUserApi() {
		User user1 = new User("user1","test@test.de","****", true);
		userRepository.save(user1);

		String url = "/users";
		User[] users = restTemplate
				.withBasicAuth("user1","****")
				.getForObject(url, User[].class);

		assertThat(users.length, is(1));
		assertThat(user1.getPassword(),is(users[0].getPassword()));
	}
}


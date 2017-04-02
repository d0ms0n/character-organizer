package de.domson.midgard;

import de.domson.midgard.pojos.User;
import de.domson.midgard.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CharacterOrganizerApplicationTests {

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Autowired
    UserRepository userRepository;

	@Before
	public void setUp(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

		userRepository.deleteAll();
		userRepository.save(new User("user1","****"));
	}

	@Test
	public void contextLoads() {
		User user1 = userRepository.findByUsername("user1");
		Assert.assertEquals(user1.getPassword(),"****");
	}

}

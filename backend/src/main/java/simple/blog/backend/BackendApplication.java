package simple.blog.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import simple.blog.backend.model.User;
import simple.blog.backend.repository.UserRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		for (int i = 0; i < 5; ++i) {
			User user = new User(i, "ASd", "base", "asdasd", null);
			userRepository.save(user);
		}
	}

}

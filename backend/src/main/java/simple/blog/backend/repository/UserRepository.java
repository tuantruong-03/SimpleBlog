package simple.blog.backend.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import simple.blog.backend.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {
    User findByUsername(String username);
    User findByUserId(Integer userId);
}

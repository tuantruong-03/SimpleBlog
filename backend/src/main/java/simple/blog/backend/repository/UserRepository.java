package simple.blog.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import simple.blog.backend.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
	
    public User findByUsername(String username);
    public User findByUserId(Integer userId);
    public User findByEmail(String email);
 
    public boolean existsByUsername(String username);
    public boolean existsByEmail(String email);
}

package simple.blog.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import simple.blog.backend.model.User;
import simple.blog.backend.service.UserService;

@RequestMapping("/api/v1/users")
@RestController
public class UserControllerV1 {
    private UserService userService;

    public UserControllerV1(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping()
    public List<User> getUserList() {
        return userService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUserByUserId(@PathVariable Integer userId) {
        return userService.findUserByUserId(userId);
    }
}

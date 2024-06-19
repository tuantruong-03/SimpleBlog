package simple.blog.backend.dto;

import java.util.Set;

import lombok.Data;
import simple.blog.backend.model.Role;

@Data
public class UserDTO {
    private Integer userId;
    private String username;
    private String email;
    private Set<Role> roles;

}

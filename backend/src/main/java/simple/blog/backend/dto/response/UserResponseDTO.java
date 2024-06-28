package simple.blog.backend.dto.response;

import java.util.Set;

import lombok.Data;
import simple.blog.backend.model.Role;

@Data
public class UserResponseDTO {
    private Integer userId;
    
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String profilePicture;
    private Set<Role> roles;

}

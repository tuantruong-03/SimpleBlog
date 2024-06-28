package simple.blog.backend.dto.request;

import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRegistrationDTO {
    
    @NotBlank(message =  "Username must be not blank!")
    @NotNull(message =  "Username must be not empty!")
    private String username;
    @Email(message = "Invalid email format!")
    private String email;

    @NotBlank(message =  "Firstname must be not blank!")
    @Pattern(regexp = "([A-Z][a-z]*)", message = "First letter must be capitalized!")
    private String firstName;
    
    @NotBlank(message =  "Lastname must be not blank!")
    @Pattern(regexp = "([A-Z][a-z]*)", message = "First letter must be capitalized!")
    private String lastName;

    @Size(min = 5, max = 10, message = "Password must be from 5 to 10 letters!")
    private String password;

    private String profilePicture;

}

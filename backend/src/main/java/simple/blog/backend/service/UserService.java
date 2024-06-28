package simple.blog.backend.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import simple.blog.backend.dto.request.UserRegistrationDTO;
import simple.blog.backend.dto.response.UserResponseDTO;

public interface UserService extends UserDetailsService {

    public List<UserResponseDTO> findAllUsers();
    public UserResponseDTO findUserByUserId(Integer userId);
    public UserResponseDTO register(UserRegistrationDTO request);

    @Override
    default UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    }



}

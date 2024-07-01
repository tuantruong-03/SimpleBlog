package simple.blog.backend.service;


import simple.blog.backend.model.RefreshToken;

public interface RefreshTokenService {
    RefreshToken findByUsername(String username);
}

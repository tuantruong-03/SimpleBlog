package simple.blog.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
@Document("roles")
public class Role implements GrantedAuthority {

    @Id
    @Field(name = "role_id")
    private Integer roleId;

    private String authority;




    @Override
    public String getAuthority() {
        return authority;
    }
    
}

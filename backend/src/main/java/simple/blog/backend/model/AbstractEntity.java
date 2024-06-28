package simple.blog.backend.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;


public class AbstractEntity {

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date modifiedAt;


}

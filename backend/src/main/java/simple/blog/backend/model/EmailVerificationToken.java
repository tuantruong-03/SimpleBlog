package simple.blog.backend.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Document("email_verification_tokens")
public class EmailVerificationToken {

	 
	 private String userEmail;
	 private String token;
	 private Date expiryDate;

}

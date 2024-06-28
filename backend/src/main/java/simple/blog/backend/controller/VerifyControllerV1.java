package simple.blog.backend.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import simple.blog.backend.dto.response.ResponseDTO;
import simple.blog.backend.service.EmailVerificationTokenService;

@RestController
@RequestMapping("/api/v1/verify")
@RequiredArgsConstructor
public class VerifyControllerV1 {
	
	private final EmailVerificationTokenService emailVerificationTokenService;
	
	
	
	@PostMapping("/confirm-account-registration")
	public ResponseEntity<ResponseDTO> confirmAccountRegistration(@RequestBody String token) throws UnsupportedEncodingException, MessagingException {
		
		if(emailVerificationTokenService.confirmAccountRegistration(token)) {
			ResponseDTO resp = ResponseDTO.builder()
					.statusCode(200)
					.message("Account is confirmed successfully")
					.build();
			return new ResponseEntity<>(resp, HttpStatus.OK);
		}
		ResponseDTO resp = ResponseDTO.builder()
				.statusCode(HttpStatus.ACCEPTED.value())
				.message("Token expired. A new confirmation email has been sent.")
				.build();
		return new ResponseEntity<>(resp, HttpStatus.ACCEPTED);
		
	}

}
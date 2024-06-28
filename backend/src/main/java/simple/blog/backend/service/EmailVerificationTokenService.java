package simple.blog.backend.service;

import java.io.UnsupportedEncodingException;

import jakarta.mail.MessagingException;

public interface EmailVerificationTokenService {
	
	public void sendConfirmationEmail(String recipientEmail) throws UnsupportedEncodingException, MessagingException;
}

package simple.blog.backend.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import simple.blog.backend.service.EmailVerificationTokenService;

@Service
@RequiredArgsConstructor
public class EmailVerificationTokenServiceImpl implements EmailVerificationTokenService {

	private final JavaMailSender javaMailSender;
	
	@Override
	public void sendConfirmationEmail(String recipientEmail) throws UnsupportedEncodingException, MessagingException {
	    String token = UUID.randomUUID().toString();
	    
	    MimeMessage message = javaMailSender.createMimeMessage();
	    MimeMessageHelper helper = new MimeMessageHelper(message);

	    helper.setFrom("contact@simpleblog.com", "Simple Blog Support");
	    helper.setTo(recipientEmail);

	    String subject = "Please confirm your account";
	    String link = "http://localhost:3000/confirm_account?token=" + token;

	    String content = "<p>Hello,</p>"
	                    + "<p>Thank you for registering with Simple Blog.</p>"
	                    + "<p>Please click the link below to confirm your account:</p>"
	                    + "<p><a href=\"" + link + "\">Confirm my account</a></p>"
	                    + "<br>"
	                    + "<p>If you did not register for this account, please ignore this email.</p>";

	    helper.setSubject(subject);

	    helper.setText(content, true);
	    javaMailSender.send(message);
	}


}

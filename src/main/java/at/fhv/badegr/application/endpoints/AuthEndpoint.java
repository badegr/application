package at.fhv.badegr.application.endpoints;

import java.security.MessageDigest;

import org.apache.tomcat.util.security.MD5Encoder;

// Start of user code (user defined imports)

// End of user code

@org.springframework.web.bind.annotation.RestController
public class AuthEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("/login")
	public String login(@org.springframework.web.bind.annotation.RequestParam("email") String email) throws Exception {
		// Start of user code login
		//Create every time from the same E-Mail the Same Hash and give it back as a tocken
		byte[] bytesOfMessage = email.getBytes("UTF-8");
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		return messageDigest.digest(bytesOfMessage).toString();
		// End of user code
	}
	
	@org.springframework.web.bind.annotation.PostMapping("/logout")
	public void logout(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code logout
		
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}

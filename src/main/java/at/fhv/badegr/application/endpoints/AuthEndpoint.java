package at.fhv.badegr.application.endpoints;

import org.springframework.beans.factory.annotation.Autowired;

import at.fhv.badegr.application.handlers.AuthHandler;
// End of user code

@org.springframework.web.bind.annotation.RestController
public class AuthEndpoint {
	// Start of user code (user defined attributes)
	@Autowired
	private AuthHandler authHandler;
	// End of user code

	@org.springframework.web.bind.annotation.PostMapping("/logout")
	public void logout(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code logout
		authHandler.logout(token);
		// End of user code
	}

	@org.springframework.web.bind.annotation.PostMapping("/login")
	public String login(@org.springframework.web.bind.annotation.RequestParam("email") String email) throws Exception {
		// Start of user code login
		String token =  authHandler.login(email);
		return "HTTP/1.1 200 OK " + token;
		// End of user code
	}

	// Start of user code (user defined operations)

	// End of user code
}

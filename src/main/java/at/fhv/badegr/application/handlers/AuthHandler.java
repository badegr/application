package at.fhv.badegr.application.handlers;

// Start of user code (user defined imports)

import org.springframework.stereotype.Component;
import org.apache.commons.codec.digest.DigestUtils;


@Component
// End of user code

public class AuthHandler {
	// Start of user code (user defined attributes)

	// End of user code

	private static AuthHandler INSTANCE;

	private AuthHandler() {
		// singleton
	}

	public static AuthHandler getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new AuthHandler();
		}

		return INSTANCE;
	}

	public String login(String email) throws Exception {
		// Start of user code login
		// Create MD5 hash of email as token
		return DigestUtils.md2Hex(email);
		// End of user code
	}

	public void logout(String token) throws Exception {
		// Start of user code logout

		// End of user code
	}

	// Start of user code (user defined operations)

	// End of user code

}

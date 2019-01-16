package at.fhv.badegr.application.endpoints;

// Start of user code (user defined imports)

// End of user code

@org.springframework.web.bind.annotation.RestController
public class SearchEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("")
	public at.fhv.badegr.application.models.SearchResult searchRandom(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code searchRandom
		return null;
		// End of user code
	}
	
	@org.springframework.web.bind.annotation.PostMapping("/analyze")
	public at.fhv.badegr.application.models.SearchResult search(@org.springframework.web.bind.annotation.RequestParam("text") String text, @org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code search
		return null;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}

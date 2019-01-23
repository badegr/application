package at.fhv.badegr.application.endpoints;

// Start of user code (user defined imports)
import org.springframework.beans.factory.annotation.Autowired;
import at.fhv.badegr.application.handlers.SearchHandler;
// End of user code

@org.springframework.web.bind.annotation.RestController
public class SearchEndpoint {
	// Start of user code (user defined attributes)
	@Autowired
	private SearchHandler searchHandler;
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("")
	public at.fhv.badegr.application.models.SearchResult searchRandom(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code searchRandom
		return searchHandler.searchRandom(token);
		// End of user code
	}
	
	@org.springframework.web.bind.annotation.PostMapping("/analyze")
	public at.fhv.badegr.application.models.SearchResult search(@org.springframework.web.bind.annotation.RequestParam("text") String text, @org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code search
		return searchHandler.search(text, token);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}

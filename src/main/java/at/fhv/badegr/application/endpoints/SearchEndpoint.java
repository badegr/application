package at.fhv.badegr.application.endpoints;



// Start of user code (user defined imports)
import org.springframework.beans.factory.annotation.Autowired;
import at.fhv.badegr.application.handlers.SearchHandler;
import at.fhv.badegr.application.models.SearchResult;
// End of user code

@org.springframework.web.bind.annotation.RestController
public class SearchEndpoint {
	// Start of user code (user defined attributes)
	@Autowired
	private SearchHandler searchHandler;
	@Autowired
	private HistoryEndpoint historyEndpoint;
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("/analyze")
	public at.fhv.badegr.application.models.SearchResult search(@org.springframework.web.bind.annotation.RequestParam("text") String text, 
			@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code search
		SearchResult sr = searchHandler.search(text, token);
		historyEndpoint.saveToHistory(token, sr.url);
		return sr;
		// End of user code
	}
	
	@org.springframework.web.bind.annotation.PostMapping("")
	public at.fhv.badegr.application.models.SearchResult searchRandom(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code searchRandom
		SearchResult sr = searchHandler.searchRandom(token);
		historyEndpoint.saveToHistory(token, sr.url);
		return sr;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}

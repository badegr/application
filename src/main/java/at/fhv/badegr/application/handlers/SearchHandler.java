package at.fhv.badegr.application.handlers;

// Start of user code (user defined imports)

// End of user code

public class SearchHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static SearchHandler INSTANCE;
	
	private SearchHandler(){
	    // singleton
	}
	
	public static SearchHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new SearchHandler();
	    }
	
	    return INSTANCE;
	}
	
	public at.fhv.badegr.application.models.SearchResult search(String text, String token) throws Exception {
		// Start of user code search
		return null;
		// End of user code
	}
	
	public at.fhv.badegr.application.models.SearchResult searchRandom(String token) throws Exception {
		// Start of user code searchRandom
		return null;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}

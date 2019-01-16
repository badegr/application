package at.fhv.badegr.application.handlers;

// Start of user code (user defined imports)

// End of user code

public class HistoryHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static HistoryHandler INSTANCE;
	
	private HistoryHandler(){
	    // singleton
	}
	
	public static HistoryHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new HistoryHandler();
	    }
	
	    return INSTANCE;
	}
	
	public at.fhv.badegr.application.models.History getHistory(String token) throws Exception {
		// Start of user code getHistory
		return null;
		// End of user code
	}
	
	public void addHistory(String token, String text, at.fhv.badegr.application.models.SearchResult result) throws Exception {
		// Start of user code addHistory
		
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}

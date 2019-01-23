package at.fhv.badegr.application.endpoints;

// Start of user code (user defined imports)
import org.springframework.beans.factory.annotation.Autowired;
import at.fhv.badegr.application.handlers.HistoryHandler;
// End of user code

@org.springframework.web.bind.annotation.RestController
public class HistoryEndpoint {
	// Start of user code (user defined attributes)
	@Autowired
	private HistoryHandler historyHandler;
	// End of user code

	@org.springframework.web.bind.annotation.GetMapping("/history")
	public at.fhv.badegr.application.models.History getHistory(
			@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code getHistory
		return historyHandler.getHistory(token);
		// End of user code
	}

	// Start of user code (user defined operations)

	// End of user code
}

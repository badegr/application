package at.fhv.badegr.application.endpoints;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import at.fhv.badegr.application.models.History;
import at.fhv.badegr.application.models.HistoryItem;

// Start of user code (user defined imports)

// End of user code

@org.springframework.web.bind.annotation.RestController
public class HistoryEndpoint {
	// Start of user code (user defined attributes)
	HashMap<String, LinkedList<String>> history = new HashMap<>();
	// End of user code
	
	
	@org.springframework.web.bind.annotation.GetMapping("/history")
	public at.fhv.badegr.application.models.History getHistory(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code getHistory
		return getHistoryForToken(token);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	public void saveToHistory(String token, String gifUrl) {
		if (history.containsKey(token)) {
			history.get(token).add(gifUrl);
		}else {
			LinkedList<String> newList = new LinkedList<>();
			newList.add(gifUrl);
			history.put(token, newList);
		}
		
	}
	
	private History getHistoryForToken(String token) {
		History h = new History();
		if(history.containsKey(token)) {
			LinkedList<String> urls = history.get(token);
			HashSet<HistoryItem> set = new HashSet<>();
			for (String str : urls) {
				HistoryItem hi = new HistoryItem();
				hi.setText(str);
				set.add(hi);
			}
			h.setItems(set);			
		}
		
		return h;
		
	}
	// End of user code
}

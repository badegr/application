package at.fhv.badegr.application.handlers;

// Start of user code (user defined imports)
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import at.fhv.badegr.application.models.History;
import at.fhv.badegr.application.models.HistoryItem;

@Component
// End of user code

public class HistoryHandler {
	// Start of user code (user defined attributes)
	private static Map<String, History> historyMap = new HashMap<>();
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
		return historyMap.get(token);
		// End of user code
	}
	
	public void addHistory(String token, String text, at.fhv.badegr.application.models.SearchResult result) throws Exception {
		// Start of user code addHistory
		if (!historyMap.containsKey(token)) {
			historyMap.put(token, new History());
		}

		HistoryItem item = new HistoryItem();
		item.result = result;
		// TODO: add other properties which are currently not provided

		historyMap.get(token).items.add(item);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	/*
	private History getHistoryForToken(String token) {
		History h = new History();
		if (history.containsKey(token)) {
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
	*/
	// End of user code
	
}

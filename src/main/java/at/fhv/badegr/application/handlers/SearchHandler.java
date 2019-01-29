package at.fhv.badegr.application.handlers;

// Start of user code (user defined imports)
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import at.fhv.badegr.application.dtos.GiphyResponse;
import at.fhv.badegr.application.models.SearchResult;

@Component
// End of user code

public class SearchHandler {
	// Start of user code (user defined attributes)
	@Value("${giphy_api_key}")
	private String apiKey;

	// @Autowired
	// private HistoryHandler historyHandler;

	@Autowired
	private RestTemplate restTemplate;
	// End of user code

	private static SearchHandler INSTANCE;

	private SearchHandler() {
		// singleton
	}

	public static SearchHandler getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SearchHandler();
		}

		return INSTANCE;
	}

	public at.fhv.badegr.application.models.SearchResult search(String text, String token) throws Exception {
		// Start of user code search
		String url = "https://api.giphy.com/v1/gifs/random";

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("api_key", apiKey);
		if (text != null && text != "") {
			uriVariables.put("tag", text);
		}

		SearchResult result = fetch(url, uriVariables);

		// TODO: add to history

		return result;
		// End of user code
	}

	public at.fhv.badegr.application.models.SearchResult searchRandom(String token) throws Exception {
		// Start of user code searchRandom
		String url = "https://api.giphy.com/v1/gifs/random";

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("api_key", apiKey);

		SearchResult result = fetch(url, uriVariables);

		// TODO: add to history

		return result;
		// End of user code
	}

	// Start of user code (user defined operations)
	private SearchResult fetch(String uri, Map<String, String> uriVariables) {
		GiphyResponse response = restTemplate.getForObject(uri, GiphyResponse.class, uriVariables);

		SearchResult result = new SearchResult();
		result.url = response.getData().getImages().getOriginal().getUrl();
		return result;
	}
	// End of user code

}

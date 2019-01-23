package at.fhv.badegr.application.handlers;

// Start of user code (user defined imports)
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import at.fhv.badegr.application.models.Data;
import at.fhv.badegr.application.models.GiphyGif;
import at.fhv.badegr.application.models.GiphyRandomResponse;
import at.fhv.badegr.application.models.GiphySearchResponse;
import at.fhv.badegr.application.models.Original;

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

		GiphySearchResponse response = restTemplate.getForObject(url, GiphySearchResponse.class, uriVariables);

		GiphyGif[] result = response.getData().stream().map(this::convert).toArray(GiphyGif[]::new);

		System.out.println(result);

		// TODO: add to history

		return null;
		// End of user code
	}

	public at.fhv.badegr.application.models.SearchResult searchRandom(String token) throws Exception {
		// Start of user code searchRandom
		String url = "https://api.giphy.com/v1/gifs/random";

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("api_key", apiKey);

		GiphyRandomResponse response = restTemplate.getForObject(url, GiphyRandomResponse.class, uriVariables);

		GiphyGif[] result = { this.convert(response.getData()) };

		System.out.println(result);

		// TODO: add to history

		return null;
		// End of user code
	}

	// Start of user code (user defined operations)
	private GiphyGif convert(Data data) {
		String title = data.getTitle();
		Original imagesOriginal = data.getImages().getOriginal();
		String gifUrl = imagesOriginal.getUrl();
		String mp4Url = imagesOriginal.getMp4();
		String webpUrl = imagesOriginal.getWebp();
		return new GiphyGif(title, gifUrl, mp4Url, webpUrl);
	}
	// End of user code

}

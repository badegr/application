package at.fhv.badegr.application.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GiphyGif {

	// title
	private String title;
	// images.original.url
	private String gifUrl;
	// images.original.mp4
	private String mp4Url;
	// images.original.webp
	private String webpUrl;

	public GiphyGif(String title, String gifUrl, String mp4Url, String webpUrl) {
		this.title = title;
		this.gifUrl = gifUrl;
		this.mp4Url = mp4Url;
		this.webpUrl = webpUrl;
	}

	public String getTitle() {
		return title;
	}

	public String getGifUrl() {
		return gifUrl;
	}

	public String getMp4Url() {
		return mp4Url;
	}

	public String getWebpUrl() {
		return webpUrl;
	}
}

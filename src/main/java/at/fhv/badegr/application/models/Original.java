package at.fhv.badegr.application.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "url", "mp4", "webp" })
public class Original {

  @JsonProperty("url")
  private String url;
  @JsonProperty("mp4")
  private String mp4;
  @JsonProperty("webp")
  private String webp;

  /**
   * No args constructor for use in serialization
   * 
   */
  public Original() {
  }

  /**
   * 
   * @param webp
   * @param mp4
   * @param url
   */
  public Original(String url, String mp4, String webp) {
    super();
    this.url = url;
    this.mp4 = mp4;
    this.webp = webp;
  }

  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  @JsonProperty("mp4")
  public String getMp4() {
    return mp4;
  }

  @JsonProperty("mp4")
  public void setMp4(String mp4) {
    this.mp4 = mp4;
  }

  @JsonProperty("webp")
  public String getWebp() {
    return webp;
  }

  @JsonProperty("webp")
  public void setWebp(String webp) {
    this.webp = webp;
  }

}

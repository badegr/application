package at.fhv.badegr.application.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "images", "title" })
public class Data {

  @JsonProperty("images")
  private Images images;
  @JsonProperty("title")
  private String title;

  /**
   * No args constructor for use in serialization
   * 
   */
  public Data() {
  }

  /**
   * 
   * @param title
   * @param images
   */
  public Data(Images images, String title) {
    super();
    this.images = images;
    this.title = title;
  }

  @JsonProperty("images")
  public Images getImages() {
    return images;
  }

  @JsonProperty("images")
  public void setImages(Images images) {
    this.images = images;
  }

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

}

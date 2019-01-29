package at.fhv.badegr.application.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "images" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

  @JsonProperty("images")
  private Images images;

  @JsonProperty("images")
  public Images getImages() {
    return images;
  }

  @JsonProperty("images")
  public void setImages(Images images) {
    this.images = images;
  }

}

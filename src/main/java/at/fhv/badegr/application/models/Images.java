package at.fhv.badegr.application.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "original" })
public class Images {

  @JsonProperty("original")
  private Original original;

  /**
   * No args constructor for use in serialization
   * 
   */
  public Images() {
  }

  /**
   * 
   * @param original
   */
  public Images(Original original) {
    super();
    this.original = original;
  }

  @JsonProperty("original")
  public Original getOriginal() {
    return original;
  }

  @JsonProperty("original")
  public void setOriginal(Original original) {
    this.original = original;
  }

}

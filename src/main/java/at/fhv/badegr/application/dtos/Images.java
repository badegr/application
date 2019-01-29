package at.fhv.badegr.application.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "original" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Images {

  @JsonProperty("original")
  private Original original;

  @JsonProperty("original")
  public Original getOriginal() {
    return original;
  }

  @JsonProperty("original")
  public void setOriginal(Original original) {
    this.original = original;
  }

}

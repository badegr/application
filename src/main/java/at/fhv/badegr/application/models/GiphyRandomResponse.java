package at.fhv.badegr.application.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class GiphyRandomResponse {

  @JsonProperty("data")
  private Data data = null;

  /**
   * No args constructor for use in serialization
   * 
   */
  public GiphyRandomResponse() {
  }

  /**
   * 
   * @param data
   */
  public GiphyRandomResponse(Data data) {
    this.data = data;
  }

  @JsonProperty("data")
  public Data getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(Data data) {
    this.data = data;
  }

}

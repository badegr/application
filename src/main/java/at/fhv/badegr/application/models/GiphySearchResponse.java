package at.fhv.badegr.application.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class GiphySearchResponse {

  @JsonProperty("data")
  private List<Data> data = null;

  /**
   * No args constructor for use in serialization
   * 
   */
  public GiphySearchResponse() {
  }

  /**
   * 
   * @param data
   */
  public GiphySearchResponse(List<Data> data) {
    this.data = data;
  }

  @JsonProperty("data")
  public List<Data> getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(List<Data> data) {
    this.data = data;
  }

}

package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.NormalisedAddress;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GeocodeResult
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:15:01.769029535Z[GMT]")public class GeocodeResult {

  private String query;

  /**
   * Gets or Sets matchQuality
   */
  public enum MatchQualityEnum {
    EXACT("EXACT"),
    
    ROOFTOP("ROOFTOP"),
    
    INTERPOLATED("INTERPOLATED"),
    
    APPROXIMATE("APPROXIMATE");

    private String value;

    MatchQualityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MatchQualityEnum fromValue(String value) {
      for (MatchQualityEnum b : MatchQualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private MatchQualityEnum matchQuality;

  private Double latitude;

  private Double longitude;

  private NormalisedAddress address;

  public GeocodeResult query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  */
    @Schema(name = "query", example = "123 Main Street, New York", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public GeocodeResult matchQuality(MatchQualityEnum matchQuality) {
    this.matchQuality = matchQuality;
    return this;
  }

  /**
   * Get matchQuality
   * @return matchQuality
  */
    @Schema(name = "matchQuality", example = "ROOFTOP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matchQuality")
  public MatchQualityEnum getMatchQuality() {
    return matchQuality;
  }

  public void setMatchQuality(MatchQualityEnum matchQuality) {
    this.matchQuality = matchQuality;
  }

  public GeocodeResult latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  */
    @Schema(name = "latitude", example = "40.750742", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public GeocodeResult longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  */
    @Schema(name = "longitude", example = "-73.993439", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public GeocodeResult address(NormalisedAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid   @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public NormalisedAddress getAddress() {
    return address;
  }

  public void setAddress(NormalisedAddress address) {
    this.address = address;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodeResult geocodeResult = (GeocodeResult) o;
    return Objects.equals(this.query, geocodeResult.query) &&
        Objects.equals(this.matchQuality, geocodeResult.matchQuality) &&
        Objects.equals(this.latitude, geocodeResult.latitude) &&
        Objects.equals(this.longitude, geocodeResult.longitude) &&
        Objects.equals(this.address, geocodeResult.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, matchQuality, latitude, longitude, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodeResult {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    matchQuality: ").append(toIndentedString(matchQuality)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


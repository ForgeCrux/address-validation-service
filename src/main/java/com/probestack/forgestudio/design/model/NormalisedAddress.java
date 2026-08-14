package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * NormalisedAddress
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:15:01.769029535Z[GMT]")
@Document(collection = "address_validation_service_geocoding")
public class NormalisedAddress {

    private String line1;

    private String line2;

    private String city;

    private String state;

    private String postalCode;

    private String country;

    private Double latitude;

    private Double longitude;

    public NormalisedAddress line1(String line1) {
        this.line1 = line1;
        return this;
    }

    /**
     * Get line1
     * @return line1
     */
    @Schema(name = "line1", example = "123 MAIN ST", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public NormalisedAddress line2(String line2) {
        this.line2 = line2;
        return this;
    }

    /**
     * Get line2
     * @return line2
     */
    @Schema(name = "line2", example = "APT 4B", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public NormalisedAddress city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     * @return city
     */
    @Schema(name = "city", example = "NEW YORK", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public NormalisedAddress state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Schema(name = "state", example = "NY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public NormalisedAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get postalCode
     * @return postalCode
     */
    @Schema(name = "postalCode", example = "10001-1234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public NormalisedAddress country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get country
     * @return country
     */
    @Schema(name = "country", example = "US", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public NormalisedAddress latitude(Double latitude) {
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

    public NormalisedAddress longitude(Double longitude) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NormalisedAddress normalisedAddress = (NormalisedAddress) o;
        return Objects.equals(this.line1, normalisedAddress.line1) && Objects.equals(this.line2, normalisedAddress.line2) && Objects.equals(this.city, normalisedAddress.city) && Objects.equals(this.state, normalisedAddress.state) && Objects.equals(this.postalCode, normalisedAddress.postalCode) && Objects.equals(this.country, normalisedAddress.country) && Objects.equals(this.latitude, normalisedAddress.latitude) && Objects.equals(this.longitude, normalisedAddress.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line1, line2, city, state, postalCode, country, latitude, longitude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NormalisedAddress {\n");
        sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
        sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

    @Id()
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

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
 * ValidateAddressRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:15:01.769029535Z[GMT]")
@Document(collection = "address_validation_service_validation")
public class ValidateAddressRequest {

    private String line1;

    private String line2;

    private String city;

    private String state;

    private String postalCode;

    private String country;

    public ValidateAddressRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ValidateAddressRequest(String line1, String country) {
        this.line1 = line1;
        this.country = country;
    }

    public ValidateAddressRequest line1(String line1) {
        this.line1 = line1;
        return this;
    }

    /**
     * Get line1
     * @return line1
     */
    @NotNull
    @Schema(name = "line1", example = "123 Main Street", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public ValidateAddressRequest line2(String line2) {
        this.line2 = line2;
        return this;
    }

    /**
     * Get line2
     * @return line2
     */
    @Schema(name = "line2", example = "Apt 4B", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public ValidateAddressRequest city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     * @return city
     */
    @Schema(name = "city", example = "New York", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ValidateAddressRequest state(String state) {
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

    public ValidateAddressRequest postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get postalCode
     * @return postalCode
     */
    @Schema(name = "postalCode", example = "10001", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public ValidateAddressRequest country(String country) {
        this.country = country;
        return this;
    }

    /**
     * ISO 3166-1 alpha-2 country code
     * @return country
     */
    @NotNull
    @Size(min = 2, max = 2)
    @Schema(name = "country", example = "US", description = "ISO 3166-1 alpha-2 country code", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidateAddressRequest validateAddressRequest = (ValidateAddressRequest) o;
        return Objects.equals(this.line1, validateAddressRequest.line1) && Objects.equals(this.line2, validateAddressRequest.line2) && Objects.equals(this.city, validateAddressRequest.city) && Objects.equals(this.state, validateAddressRequest.state) && Objects.equals(this.postalCode, validateAddressRequest.postalCode) && Objects.equals(this.country, validateAddressRequest.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line1, line2, city, state, postalCode, country);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateAddressRequest {\n");
        sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
        sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

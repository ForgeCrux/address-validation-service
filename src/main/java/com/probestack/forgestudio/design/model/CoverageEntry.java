package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * CoverageEntry
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:15:01.769029535Z[GMT]")
@Document(collection = "address_validation_service_coverage")
public class CoverageEntry {

    private String country;

    private String countryName;

    private String datasetVersion;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastRefreshedAt;

    private Boolean supportsGeocoding;

    public CoverageEntry country(String country) {
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

    public CoverageEntry countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * Get countryName
     * @return countryName
     */
    @Schema(name = "countryName", example = "United States", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public CoverageEntry datasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }

    /**
     * Get datasetVersion
     * @return datasetVersion
     */
    @Schema(name = "datasetVersion", example = "USPS-2026-07", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("datasetVersion")
    public String getDatasetVersion() {
        return datasetVersion;
    }

    public void setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
    }

    public CoverageEntry lastRefreshedAt(OffsetDateTime lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
        return this;
    }

    /**
     * Get lastRefreshedAt
     * @return lastRefreshedAt
     */
    @Valid
    @Schema(name = "lastRefreshedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lastRefreshedAt")
    public OffsetDateTime getLastRefreshedAt() {
        return lastRefreshedAt;
    }

    public void setLastRefreshedAt(OffsetDateTime lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
    }

    public CoverageEntry supportsGeocoding(Boolean supportsGeocoding) {
        this.supportsGeocoding = supportsGeocoding;
        return this;
    }

    /**
     * Get supportsGeocoding
     * @return supportsGeocoding
     */
    @Schema(name = "supportsGeocoding", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("supportsGeocoding")
    public Boolean getSupportsGeocoding() {
        return supportsGeocoding;
    }

    public void setSupportsGeocoding(Boolean supportsGeocoding) {
        this.supportsGeocoding = supportsGeocoding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CoverageEntry coverageEntry = (CoverageEntry) o;
        return Objects.equals(this.country, coverageEntry.country) && Objects.equals(this.countryName, coverageEntry.countryName) && Objects.equals(this.datasetVersion, coverageEntry.datasetVersion) && Objects.equals(this.lastRefreshedAt, coverageEntry.lastRefreshedAt) && Objects.equals(this.supportsGeocoding, coverageEntry.supportsGeocoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, countryName, datasetVersion, lastRefreshedAt, supportsGeocoding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoverageEntry {\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
        sb.append("    datasetVersion: ").append(toIndentedString(datasetVersion)).append("\n");
        sb.append("    lastRefreshedAt: ").append(toIndentedString(lastRefreshedAt)).append("\n");
        sb.append("    supportsGeocoding: ").append(toIndentedString(supportsGeocoding)).append("\n");
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

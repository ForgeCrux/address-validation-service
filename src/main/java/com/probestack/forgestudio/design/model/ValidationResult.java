package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.NormalisedAddress;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ValidationResult
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:15:01.769029535Z[GMT]")public class ValidationResult {

  private Boolean valid;

  private Double confidence;

  private NormalisedAddress normalised;

  @Valid
  private List<String> corrections;

  private Boolean deliverable;

  public ValidationResult valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
  */
    @Schema(name = "valid", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ValidationResult confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Get confidence
   * minimum: 0
   * maximum: 1
   * @return confidence
  */
  @DecimalMin("0") @DecimalMax("1")   @Schema(name = "confidence", example = "0.97", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  public ValidationResult normalised(NormalisedAddress normalised) {
    this.normalised = normalised;
    return this;
  }

  /**
   * Get normalised
   * @return normalised
  */
  @Valid   @Schema(name = "normalised", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("normalised")
  public NormalisedAddress getNormalised() {
    return normalised;
  }

  public void setNormalised(NormalisedAddress normalised) {
    this.normalised = normalised;
  }

  public ValidationResult corrections(List<String> corrections) {
    this.corrections = corrections;
    return this;
  }

  public ValidationResult addCorrectionsItem(String correctionsItem) {
    if (this.corrections == null) {
      this.corrections = new ArrayList<>();
    }
    this.corrections.add(correctionsItem);
    return this;
  }

  /**
   * Get corrections
   * @return corrections
  */
    @Schema(name = "corrections", example = "[\"postalCode corrected from 10011 to 10001\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("corrections")
  public List<String> getCorrections() {
    return corrections;
  }

  public void setCorrections(List<String> corrections) {
    this.corrections = corrections;
  }

  public ValidationResult deliverable(Boolean deliverable) {
    this.deliverable = deliverable;
    return this;
  }

  /**
   * Get deliverable
   * @return deliverable
  */
    @Schema(name = "deliverable", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliverable")
  public Boolean getDeliverable() {
    return deliverable;
  }

  public void setDeliverable(Boolean deliverable) {
    this.deliverable = deliverable;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResult validationResult = (ValidationResult) o;
    return Objects.equals(this.valid, validationResult.valid) &&
        Objects.equals(this.confidence, validationResult.confidence) &&
        Objects.equals(this.normalised, validationResult.normalised) &&
        Objects.equals(this.corrections, validationResult.corrections) &&
        Objects.equals(this.deliverable, validationResult.deliverable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, confidence, normalised, corrections, deliverable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResult {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    normalised: ").append(toIndentedString(normalised)).append("\n");
    sb.append("    corrections: ").append(toIndentedString(corrections)).append("\n");
    sb.append("    deliverable: ").append(toIndentedString(deliverable)).append("\n");
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


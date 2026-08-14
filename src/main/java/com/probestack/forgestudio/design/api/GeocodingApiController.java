package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.GeocodeResult;
import com.probestack.forgestudio.design.model.NormalisedAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.GeocodingService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:15:01.769029535Z[GMT]")
@Controller
@RequestMapping("${openapi.addressValidationService.base-path:/address/v1}")
public class GeocodingApiController implements GeocodingApi {

    private static final Logger log = LoggerFactory.getLogger(GeocodingApiController.class);

    private final GeocodingService geocodingService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public GeocodingApiController(GeocodingService geocodingService, GeneratedRequestValidator generatedRequestValidator) {
        this.geocodingService = geocodingService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<GeocodeResult> geocodeAddress(@RequestParam() String address, @RequestParam() String country) {
        log.info("Processing geocodeAddress request");
        try {
            var response = geocodingService.geocodeAddress(address, country);
            log.info("geocodeAddress completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process geocodeAddress: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<NormalisedAddress> reverseGeocode(@RequestParam() Double lat, @RequestParam() Double lon) {
        log.info("Processing reverseGeocode request");
        try {
            var response = geocodingService.reverseGeocode(lat, lon);
            log.info("reverseGeocode completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process reverseGeocode: {}", e.getMessage(), e);
            throw e;
        }
    }
}

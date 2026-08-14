package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.ValidateAddressRequest;
import com.probestack.forgestudio.design.model.ValidationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ValidationService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:15:01.769029535Z[GMT]")
@Controller
@RequestMapping("${openapi.addressValidationService.base-path:/address/v1}")
public class ValidationApiController implements ValidationApi {

    private static final Logger log = LoggerFactory.getLogger(ValidationApiController.class);

    private final ValidationService validationService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ValidationApiController(ValidationService validationService, GeneratedRequestValidator generatedRequestValidator) {
        this.validationService = validationService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<ValidationResult> validateAddress(@RequestBody() ValidateAddressRequest validateAddressRequest) {
        log.info("Processing validateAddress request");
        try {
            generatedRequestValidator.validate("validateAddress", validateAddressRequest);
            var response = validationService.validateAddress(validateAddressRequest);
            log.info("validateAddress completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process validateAddress: {}", e.getMessage(), e);
            throw e;
        }
    }
}

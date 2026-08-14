package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CoverageEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import java.util.List;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.CoverageService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-14T07:15:01.769029535Z[GMT]")
@Controller
@RequestMapping("${openapi.addressValidationService.base-path:/address/v1}")
public class CoverageApiController implements CoverageApi {

    private static final Logger log = LoggerFactory.getLogger(CoverageApiController.class);

    private final CoverageService coverageService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public CoverageApiController(CoverageService coverageService, GeneratedRequestValidator generatedRequestValidator) {
        this.coverageService = coverageService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<List<CoverageEntry>> listCoverage() {
        log.info("Processing listCoverage request");
        try {
            var response = coverageService.listCoverage();
            log.info("listCoverage completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listCoverage: {}", e.getMessage(), e);
            throw e;
        }
    }
}

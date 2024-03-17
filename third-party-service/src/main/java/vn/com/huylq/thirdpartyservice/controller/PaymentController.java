package vn.com.huylq.thirdpartyservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.huylq.thirdpartyservice.dto.request.PaymentRequest;
import vn.com.huylq.thirdpartyservice.dto.response.PaymentResponse;

@RestController
@RequestMapping("/v1/payments")
public class PaymentController {

    @PostMapping
    public PaymentResponse handlePaymentRequest(@RequestBody PaymentRequest request) {
        return PaymentResponse.builder()
                .errorCode("0")
                .errorMessage("Success")
                .build();
    }
}

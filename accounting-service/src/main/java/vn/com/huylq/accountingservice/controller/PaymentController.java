package vn.com.huylq.accountingservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.huylq.accountingservice.dto.request.PaymentRequest;
import vn.com.huylq.accountingservice.dto.response.PaymentResponse;

@RestController
@RequestMapping(("/v1/payments"))
public class PaymentController {

    @PostMapping
    public PaymentResponse handlePaymentRequest(@RequestBody PaymentRequest request) {
        PaymentResponse response = new PaymentResponse();
        response.setErrorCode("0");
        response.setErrorMessage("Success");
        return response;
    }
}

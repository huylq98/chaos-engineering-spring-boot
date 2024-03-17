package vn.com.huylq.paymentservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.huylq.paymentservice.dto.request.PaymentRequest;
import vn.com.huylq.paymentservice.dto.response.PaymentResponse;
import vn.com.huylq.paymentservice.service.PaymentService;

@RestController
@RequestMapping(("/v1/payments"))
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public PaymentResponse handlePaymentRequest(@RequestBody PaymentRequest request) {
        return paymentService.processPayment(request);
    }
}

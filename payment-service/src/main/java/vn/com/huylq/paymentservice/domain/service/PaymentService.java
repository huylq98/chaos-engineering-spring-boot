package vn.com.huylq.paymentservice.domain.service;

import vn.com.huylq.paymentservice.domain.dto.request.PaymentRequest;
import vn.com.huylq.paymentservice.domain.dto.response.PaymentResponse;

public interface PaymentService {
    PaymentResponse processPayment(PaymentRequest request);
}

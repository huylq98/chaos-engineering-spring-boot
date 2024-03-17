package vn.com.huylq.paymentservice.service;

import vn.com.huylq.paymentservice.dto.request.PaymentRequest;
import vn.com.huylq.paymentservice.dto.response.PaymentResponse;

public interface PaymentService {
    PaymentResponse processPayment(PaymentRequest request);
}

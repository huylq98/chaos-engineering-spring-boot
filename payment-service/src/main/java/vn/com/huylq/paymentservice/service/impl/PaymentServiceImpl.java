package vn.com.huylq.paymentservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.com.huylq.paymentservice.dto.request.PaymentRequest;
import vn.com.huylq.paymentservice.dto.response.PaymentResponse;
import vn.com.huylq.paymentservice.feign.AccountingClient;
import vn.com.huylq.paymentservice.service.PaymentService;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final AccountingClient accountingClient;

    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        return accountingClient.handlePaymentRequest(request);
    }
}

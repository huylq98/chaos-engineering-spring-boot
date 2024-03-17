package vn.com.huylq.paymentservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import vn.com.huylq.paymentservice.dto.request.PaymentRequest;
import vn.com.huylq.paymentservice.dto.response.PaymentResponse;

@FeignClient(name = "accounting-service", url = "http://localhost:8081")
public interface AccountingClient {

    @PostMapping("/v1/payments")
    PaymentResponse handlePaymentRequest(@RequestBody PaymentRequest request);
}

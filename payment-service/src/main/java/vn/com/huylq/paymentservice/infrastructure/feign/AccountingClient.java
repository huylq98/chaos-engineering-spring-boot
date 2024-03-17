package vn.com.huylq.paymentservice.infrastructure.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import vn.com.huylq.paymentservice.domain.dto.request.AccountingRequest;
import vn.com.huylq.paymentservice.domain.dto.response.AccountingResponse;

@FeignClient(name = "accounting-service", url = "${accounting-service.url}")
public interface AccountingClient {

    @PostMapping("/v1/payments")
    AccountingResponse executeAccounting(@RequestBody AccountingRequest request);
}

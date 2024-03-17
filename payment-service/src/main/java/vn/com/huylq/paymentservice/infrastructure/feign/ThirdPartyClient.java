package vn.com.huylq.paymentservice.infrastructure.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import vn.com.huylq.paymentservice.domain.dto.request.ThirdPartyRequest;
import vn.com.huylq.paymentservice.domain.dto.response.ThirdPartyResponse;

@FeignClient(name = "third-party-service", url = "${third-party-service.url}")
public interface ThirdPartyClient {

    @PostMapping("/v1/payments")
    ThirdPartyResponse executePayment(ThirdPartyRequest request);
}

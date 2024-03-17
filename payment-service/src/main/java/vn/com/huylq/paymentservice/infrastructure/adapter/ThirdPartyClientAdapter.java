package vn.com.huylq.paymentservice.infrastructure.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import vn.com.huylq.paymentservice.domain.dto.request.ThirdPartyRequest;
import vn.com.huylq.paymentservice.domain.dto.response.ThirdPartyResponse;
import vn.com.huylq.paymentservice.domain.port.ThirdPartyPort;
import vn.com.huylq.paymentservice.infrastructure.feign.ThirdPartyClient;

@Component
@RequiredArgsConstructor
public class ThirdPartyClientAdapter implements ThirdPartyPort {

    private final ThirdPartyClient thirdPartyClient;

    @Override
    public ThirdPartyResponse executePayment(ThirdPartyRequest request) {
        return thirdPartyClient.executePayment(request);
    }
}

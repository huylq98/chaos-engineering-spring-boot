package vn.com.huylq.paymentservice.domain.port;

import vn.com.huylq.paymentservice.domain.dto.request.ThirdPartyRequest;
import vn.com.huylq.paymentservice.domain.dto.response.ThirdPartyResponse;

public interface ThirdPartyPort {
    ThirdPartyResponse executePayment(ThirdPartyRequest request);
}

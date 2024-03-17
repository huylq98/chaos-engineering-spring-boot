package vn.com.huylq.paymentservice.domain.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ThirdPartyResponse {

    private String errorCode;
    private String errorMessage;
}
